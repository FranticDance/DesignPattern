package com.my.pattern.behavior.responsibilitychain.impl7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:15
 */
public class Invocation {
    Object target;
    Method method;
    Object[] args;

    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object procceed() throws InvocationTargetException, IllegalAccessException {
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
