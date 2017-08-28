package com.db.my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;


public class InjectByFieldObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();

        Set<Field> fields = ReflectionUtils.getAllFields(type);
        for (Field field : fields) {
            if(field.isAnnotationPresent(InjectByFieldType.class)){
                Object o = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t, o);
            }
        }
    }
}
