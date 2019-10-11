package com.my.pattern.responsibilitychain.impl4;

/**
 * @author lee
 * 系处理器
 */
public class DepartmentHandler implements Handler {
    @Override
    public void handle(Invoker invoker,PurchaseRequest purchaseRequest) {
        System.out.println("系主任DepartmentHandler开始处理");
        if(purchaseRequest.getPrice() <= 1000){
            System.out.println("系主任DepartmentHandler will deal it");
        }else {
            System.out.println("系主任无法处理，交给下一位");
        }
        invoker.invoke(purchaseRequest);

    }
}
