package com.my.pattern.decorator.impl1;

public class MotherDecorator extends Decorator {
    private Dress dress;

    public MotherDecorator(Dress dress) {
        this.dress = dress;
    }

    private void wearingCoat(){
        System.out.println("老妈命令你必须穿一件外套");
    }

    @Override
    public void wearingClothes() {
        dress.wearingClothes();
        wearingCoat();
    }
}
