package com.my.pattern.behavior.responsibilitychain.impl6;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 16:28
 */
public class TargetImpl implements Target {
    public void execute(PurchaseRequest book) {
        System.out.println("执行购书请求" + book.getPrice());
    }

    @Override
    public String toString() {
        return "TargetImpl{}";
    }
}
