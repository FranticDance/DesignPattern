package com.my.pattern.structure.decorator.impl2;


public class Test {
    public static void main(String[] args) {
        Dress childrenDress = new ChildrenDress();

        childrenDress = new FatherDecorator(childrenDress);

        childrenDress = new MotherDecorator(childrenDress);

        childrenDress.wearingClothes();
    }
}
