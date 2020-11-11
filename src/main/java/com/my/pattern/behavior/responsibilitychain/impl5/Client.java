package com.my.pattern.behavior.responsibilitychain.impl5;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 10:23
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new MyProxy<Handler>(new HandlerA(), new HandlerB()).doProxy(new HandlerA(), "handlerA");
        //Handler handlerB = new MyProxy<Handler>().doProxy(handlerA, "handlerB");
        handlerA.handle();
    }
}
