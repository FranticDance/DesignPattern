package com.my.pattern.behavior.responsibilitychain.impl6;

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
    private Handler interceptor;

    public TargetProxy(Object target, Handler interceptor) {
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
    public static Object bind(Object target, Handler interceptors){
        Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new TargetProxy(target, interceptors));
        return object;
    }

    @Override
    public String toString() {
        return "TargetProxy{" +
                "target=" + target +
                ", interceptor=" + interceptor +
                '}';
    }
}
