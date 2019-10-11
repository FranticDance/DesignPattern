package com.my.pattern.responsibilitychain.impl3;

public class Client {
    public static void main(String[] args) {
        //初始化各个处理器
        DepartmentHandler departmentHandler = new DepartmentHandler();
        CollegeHandler collegeHandler = new CollegeHandler();
        SchoolHandler schoolHandler = new SchoolHandler();

        //初始化处理器chain管理器
        PurchaseHandlerChain purchaseHandlerChain = new PurchaseHandlerChain();

        //注册管理器,顺序不能变，因为内部是用List实际就是数组来保存的各个处理器
        purchaseHandlerChain.registerHandler(departmentHandler);
        purchaseHandlerChain.registerHandler(collegeHandler);
        purchaseHandlerChain.registerHandler(schoolHandler);

        PurchaseRequest purchaseRequest = new PurchaseRequest(1000, "Book");

        purchaseHandlerChain.process(purchaseRequest);
    }
}
