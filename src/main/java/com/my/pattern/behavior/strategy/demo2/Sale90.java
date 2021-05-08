package com.my.pattern.behavior.strategy.demo2;

/**
 * @author lee
 * @version 1.0
 * @date 2021/5/8 下午4:55
 */
public class Sale90 implements Sale{
    private double discount = 0.9;
    @Override
    public double price(double originPrice) {
        return originPrice * discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
