package com.my.pattern.behavior.template.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:24
 */
public class Coffee3 extends Coffee {

    @Override
    public void select() {
        System.out.println("巴西咖啡");
    }

    @Override
    public void addSugar() {
        System.out.println("不加糖");
    }

    @Override
    public void freeze() {
        System.out.println("冰冻");
    }

    @Override
    public boolean discount() {
        return true;
    }

    @Override
    public void takeOut() {
        System.out.println("打包带走");
    }

}
