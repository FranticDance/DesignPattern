package com.my.pattern.behavior.responsibilitychain.impl4;


/**
 * @author lee
 * 学院处理器
 */
public class CollegeHandler implements Handler {

    @Override
    public void handle(Invoker invoker,PurchaseRequest purchaseRequest) {
        System.out.println("院主任CollegeHandler开始处理");
        if(purchaseRequest.getPrice() <= 5000 && purchaseRequest.getPrice() > 1000){
            System.out.println("院主任CollegeHandler will deal it");

        }else {
            System.out.println("院主任不能处理，交给下一位");

        }
        invoker.invoke(purchaseRequest);
    }
}
