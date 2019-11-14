package com.my.pattern.decorator.impl2;

import com.my.pattern.decorator.impl1.ChildrenDress;
import com.my.pattern.decorator.impl1.Dress;
import com.my.pattern.decorator.impl1.FatherDecorator;
import com.my.pattern.decorator.impl1.MotherDecorator;

public class Test {
    public static void main(String[] args) {
        Dress childrenDress = new ChildrenDress();

        childrenDress = new FatherDecorator(childrenDress);

        childrenDress = new MotherDecorator(childrenDress);

        childrenDress.wearingClothes();
    }
}
