package com.my.pattern.behavior.responsibilitychain.impl3plus2;


public interface Handler {
    String handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain);
}
