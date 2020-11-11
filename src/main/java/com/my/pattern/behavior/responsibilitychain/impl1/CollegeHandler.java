package com.my.pattern.behavior.responsibilitychain.impl1;

/**
 * @author lee
 */
public class CollegeHandler extends Handler {
    @Override
    public void handle(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000 && purchaseRequest.getPrice() > 1000){
            System.out.println("院主任CollegeHandler will deal it");
        }else {
            System.out.println("院主任不能处理，交给下一位");
            handler.handle(purchaseRequest);
        }
    }
}
