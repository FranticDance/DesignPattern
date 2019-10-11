package com.my.pattern.responsibilitychain.impl1;

/**
 * @author lee
 */
public class DepartmentHandler extends Handler {
    @Override
    public void handle(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 1000){
            System.out.println("系主任DepartmentHandler will deal it");
        }else {
            System.out.println("系主任不能处理，交给下一位");
            handler.handle(purchaseRequest);
        }
    }
}
