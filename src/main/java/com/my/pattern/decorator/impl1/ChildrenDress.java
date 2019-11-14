package com.my.pattern.decorator.impl1;

public class ChildrenDress extends Dress {
    private String name = "小明";

    @Override
    public void wearingClothes() {
        System.out.println("我是" + name + "，我只穿了一件秋衣");
    }
}
