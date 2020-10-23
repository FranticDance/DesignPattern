package com.my.pattern.template.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:13
 */
public abstract class Coffee implements Drink {
    /**
     * 制作咖啡
     * 这里就是定义了一个模板，内部调用抽象方法，具体实现由子类处理
     * 在很多时候，模板方法是实现的接口
     */
    @Override
    final public void make() {
        System.out.println("****选择咖啡类型****");
        select();
        System.out.println("****是否加糖****");
        addSugar();
        System.out.println("****是否冰冻****");
        freeze();
        //调用钩子函数
        if(discount()){
            System.out.println("这种咖啡有折扣哦");
        }
        //调用钩子函数
        takeOut();
        pack();
    }

    /**
     * 选择类型
     */
    public abstract void select();

    /**
     * 加糖
     */
    public abstract void addSugar();

    /**
     * 冰冻
     */
    public abstract void freeze();

    /**
     * 有些方法也不是用于提供给子类覆盖的。并且可用考虑是否final
     */
    public void pack() {
        System.out.println("咖啡已经制作好");
    }

    /**
     * 第一种形式的钩子函数。空实现，由子类去考虑是否覆盖。
     * Spring源码的AbstractApplicationContext的refresh方法中，调用了onRefresh()方法，这个方法就是一个空实现的钩子函数
     */
    public void takeOut(){

    };

    /**
     * 第二种形式的钩子函数，有实现
     * @return
     */
    public boolean discount(){
        return false;
    }
}
