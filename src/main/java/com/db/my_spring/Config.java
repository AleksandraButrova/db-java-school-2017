package com.db.my_spring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
