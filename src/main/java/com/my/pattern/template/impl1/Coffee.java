package com.my.pattern.template.impl1;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/23 15:13
 */
public abstract class Coffee {
    /**
     * 制作咖啡
     * 这里就是定义了一个模板，内部调用抽象方法，具体实现由子类处理
     * 模板方法可以定义为final，不然子类覆盖
     */
    final public void make(){
        System.out.println("****选择咖啡类型****");
        select();
        System.out.println("****是否加糖****");
        addSugar();
        System.out.println("****是否冰冻****");
        freeze();
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

    public void pack(){
        System.out.println("咖啡已经制作好");
    }
}
