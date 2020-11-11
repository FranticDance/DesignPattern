package com.my.pattern.behavior.responsibilitychain.impl4;


/**
 * @author lee
 */
public interface Handler {
    void handle(Invoker invoker,PurchaseRequest purchaseRequest);
}
