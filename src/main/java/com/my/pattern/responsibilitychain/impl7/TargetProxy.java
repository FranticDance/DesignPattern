package com.my.pattern.responsibilitychain.impl7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 16:28
 */
public class TargetProxy implements InvocationHandler {
    private Object target;
    private Interceptor interceptor;

    public TargetProxy(Object target, Interceptor interceptor) {
        this.interceptor = interceptor;
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("proxy before");
        //将代理方法，与业务方法剥离
        Invocation invocation = new Invocation(target, method, args);
        Object invoke = interceptor.intercept(invocation);
        /*for (Interceptor interceptor : interceptors) {
            invoke = interceptor.intercept(invocation);
        }*/
        //Object invoke = method.invoke(target, args);
        return invoke;
    }
    public static Object bind(Object target, Interceptor interceptors){
        Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new TargetProxy(target, interceptors));
        return object;
    }
}
