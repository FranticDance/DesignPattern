package com.my.pattern.behavior.responsibilitychain.impl3plus;

public interface Handler {
    void handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain);
}
