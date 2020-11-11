package com.my.pattern.behavior.responsibilitychain.impl5;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 9:55
 */
public class HandlerB implements Handler {

    @Override
    public void handle() {
        System.out.println("class B handle...");
    }
}
