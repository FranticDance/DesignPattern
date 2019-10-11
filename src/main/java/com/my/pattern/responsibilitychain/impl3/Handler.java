package com.my.pattern.responsibilitychain.impl3;

public interface Handler {
    void handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain);
}
