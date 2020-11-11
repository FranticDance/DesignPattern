package com.my.pattern.structure.decorator.impl2;

/**
 * 装饰模式基本组件实现类，提供功能的基本实现。
 * 同时也是被装饰的基础对象
 */
public class ChildrenDress extends Dress{
    private String name = "小明";

    @Override
    public void wearingClothes() {
        System.out.println("我是" + name + "，我只穿了一件秋衣");
    }
}
