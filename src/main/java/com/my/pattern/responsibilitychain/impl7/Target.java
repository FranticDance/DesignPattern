package com.my.pattern.responsibilitychain.impl7;

import com.my.pattern.responsibilitychain.impl6.PurchaseRequest;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 16:27
 */
public interface Target {
    public void execute(PurchaseRequest purchaseRequest);
}
