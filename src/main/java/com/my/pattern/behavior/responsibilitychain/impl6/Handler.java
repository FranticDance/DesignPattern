package com.my.pattern.behavior.responsibilitychain.impl6;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:02
 */
public interface Handler {
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
    public Object register(Object obj);
}
