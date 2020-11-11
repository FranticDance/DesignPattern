package com.my.pattern.behavior.responsibilitychain.impl7;


import java.lang.reflect.InvocationTargetException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:02
 */
public interface Interceptor {
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
}
