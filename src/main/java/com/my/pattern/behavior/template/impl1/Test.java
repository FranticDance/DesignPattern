package com.my.pattern.behavior.template.impl1;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:30
 */
public class Test {
    public static void main(String[] args) {
        Coffee1 coffee1 = new Coffee1();
        coffee1.make();
        System.out.println("---------------------");
        Coffee2 coffee2 = new Coffee2();
        coffee2.make();
    }
}
