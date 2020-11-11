package com.my.pattern.behavior.responsibilitychain.impl2;

/**
 * @author lee
 */
public class SchoolHandler implements Handler {
    @Override
    public void handle(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() >= 5000){
            System.out.println("校主任SchoolHandler will deal it");
        }else {
            System.out.println("校主任不能处理，交给下一位");
            handler.handle(purchaseRequest);
        }
    }
    protected Handler handler;
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
