package com.my.pattern.template.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:24
 */
public class Coffee2 extends Coffee {

    @Override
    public void select() {
        System.out.println("卡布奇诺咖啡");
    }

    @Override
    public void addSugar() {
        System.out.println("不加糖");
    }

    @Override
    public void freeze() {
        System.out.println("冰冻");
    }
}
