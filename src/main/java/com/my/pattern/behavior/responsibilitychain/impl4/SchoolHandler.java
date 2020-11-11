package com.my.pattern.behavior.responsibilitychain.impl4;


/**
 * @author lee
 * 学校处理器
 */
public class SchoolHandler implements Handler {
    @Override
    public void handle(Invoker invoker, PurchaseRequest purchaseRequest) {
        System.out.println("校主任SchoolHandler开始处理");
        if(purchaseRequest.getPrice() >= 5000){
            System.out.println("校主任SchoolHandler will deal it");
        }else {
            System.out.println("校主任无法处理，交给下一位");
        }
        invoker.invoke(purchaseRequest);
    }
}
