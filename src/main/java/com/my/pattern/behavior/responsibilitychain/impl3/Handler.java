package com.my.pattern.behavior.responsibilitychain.impl3;

public interface Handler {
    void handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain);
}
