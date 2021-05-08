package com.my.pattern.behavior.strategy.demo2;

/**
 * @author lee
 * @version 1.0
 * @date 2021/5/8 下午4:51
 */
public interface Sale {
    double price(double originPrice);

    double getDiscount();
}
