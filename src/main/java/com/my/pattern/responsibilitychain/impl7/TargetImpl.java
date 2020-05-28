package com.my.pattern.responsibilitychain.impl7;

import com.my.pattern.responsibilitychain.impl6.PurchaseRequest;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 16:28
 */
public class TargetImpl implements Target {
    @Override
    public void execute(PurchaseRequest purchaseRequest) {
        System.out.println("targetImpl execute" + purchaseRequest);
    }
}
