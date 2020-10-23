package com.my.pattern.template.impl1;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:24
 */
public class Coffee1 extends Coffee{

    @Override
    public void select() {
        System.out.println("拿铁咖啡");
    }

    @Override
    public void addSugar() {
        System.out.println("加少量糖");
    }

    @Override
    public void freeze() {
        System.out.println("不冰冻");
    }
}
