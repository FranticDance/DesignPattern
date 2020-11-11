package com.my.pattern.behavior.responsibilitychain.impl5;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 9:57
 */
public class MyProxy<T> implements InvocationHandler {
    private Handler handler;
    T target;
    private String handlerName;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Handler interceptor = (Handler)Class.forName(this.handlerName).newInstance();
       // interceptor.handle();
        Object invoke = method.invoke(target, args);
        return null;
    }

    public T doProxy(T target, String handlerName) {
        //this.target = target;
        //this.handlerName = handlerName;
        return  (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new MyProxy<>(target, handler));
    }

    public MyProxy(T target, Handler handler) {
        this.target =target;
        this.handler = handler;

    }
}
