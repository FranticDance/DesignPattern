package com.my.pattern.responsibilitychain.impl3plus;

public interface Handler {
    void handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain);
}
