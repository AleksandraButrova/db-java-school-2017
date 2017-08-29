package com.db.mySpring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by Evegeny on 28/08/2017.
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public <T, E extends T> E wrapWithProxy(T o) {
        if (o.getClass().isAnnotationPresent(Benchmark.class)) {
            return wrapClass(o);
        }

        return wrapMethods(o);
    }

    private <T, E extends T> E wrapClass(Object o){
        Class<?> type = o.getClass();
        return (E) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return invokeWithBenchmark(method, args, o);
            }
        });

    }

    private <T, E extends T> E wrapMethods(Object o) {
        Class<?> type = o.getClass();
        Method[] methodsArr = type.getDeclaredMethods();
        Set<String> methods = new HashSet<>();

        for(Method method : methodsArr){
            if (method.isAnnotationPresent(Benchmark.class)) {
                methods.add(method.getName());
            }
        }

        if (methods.size() == 0){
            return (E) o;
        }

        return (E) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methods.contains(method.getName())){
                    return invokeWithBenchmark(method, args, o);
                } else {
                    return method.invoke(o, args);
                }
            }
        });
    }

    private Object invokeWithBenchmark(Method method, Object[] args, Object o) throws IllegalAccessException, InvocationTargetException {
        System.out.println("************START BENCHMARK for method " + method.getName() + " *********************");
        long start = System.nanoTime();
        Object retVal = method.invoke(o, args);
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println("************END BENCHMARK for method " + method.getName() + " *********************\n");
        return retVal;
    }
}
