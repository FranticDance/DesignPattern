package com.my.pattern.structure.proxy.dynamicproxy;

import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:27
 */
public class DynamicProxyFactory {
    private Object target;

    public DynamicProxyFactory(Object target) {
        this.target = target;
    }


    public Object getProxyInstance(){
        /**
         * ClassLoader loader  loader 指定当前目标使用的类加载器
         * class<?>[] interfaces   interfaces 目标对象实现的接口方法类型，使用泛型方法确认类型
         *  InvocationHandler h   h 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk动态增强开始...");
                System.out.println("为了增强老师的效率，减轻负担，为老师提供电脑设备..");
                Object invoke = method.invoke(target, args);
                System.out.println("jdk动态增强结束...");
                return invoke;
            }
        });
    }
}
