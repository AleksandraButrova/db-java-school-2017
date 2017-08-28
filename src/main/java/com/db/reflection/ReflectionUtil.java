package com.db.reflection;

import java.lang.reflect.Method;
import java.util.stream.Stream;

public class ReflectionUtil {
    public static void printAllMethods(Object o){
        Class<?> type = o.getClass();

        while (type!=null){
            Stream.of(type.getDeclaredMethods()).forEach(System.out::println);
            type = type.getSuperclass();
        }
    }
}
