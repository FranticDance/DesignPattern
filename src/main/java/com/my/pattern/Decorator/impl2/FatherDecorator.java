package com.my.pattern.Decorator.impl2;

/**
 * 实际装饰类
 */
public class FatherDecorator extends Decorator {
    public FatherDecorator(Dress dress) {
        super(dress);
    }

    private void wearingHat(){
        System.out.println("老爸命令你必须戴个帽子");
    }

    @Override
    public void wearingClothes() {
        super.wearingClothes();
        wearingHat();
    }
}
