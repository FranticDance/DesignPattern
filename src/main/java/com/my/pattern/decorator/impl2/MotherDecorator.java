package com.my.pattern.decorator.impl2;

/**
 * 实际装饰类
 */
public class MotherDecorator extends Decorator {
    public MotherDecorator(Dress dress) {
        super(dress);
    }

    private void wearingCoat(){
        System.out.println("老妈命令你必须穿一件外套");
    }

    @Override
    public void wearingClothes() {
        super.wearingClothes();
        wearingCoat();
    }
}
