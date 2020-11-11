package com.my.pattern.structure.decorator.impl1;

public class FatherDecorator extends Decorator {
    private Dress dress;

    public FatherDecorator(Dress dress) {
        this.dress = dress;
    }

    private void wearingHat(){
        System.out.println("老爸命令你必须戴个帽子");
    }
    @Override
    public void wearingClothes() {
        dress.wearingClothes();
        wearingHat();
    }
}
