package com.my.pattern.structure.decorator.impl2;

/**
 * 装饰模式基础抽象装饰类
 * 同样去继承基础组件类，使得装饰类对象可以赋值给组件类引用.
 * 并持有组件类引用，调用组件类的功能方法
 */
public abstract class Decorator extends Dress{
    private Dress dress;

    public Decorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void wearingClothes() {
        dress.wearingClothes();
    }
}
