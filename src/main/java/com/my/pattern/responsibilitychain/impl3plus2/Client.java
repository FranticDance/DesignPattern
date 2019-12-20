package com.my.pattern.responsibilitychain.impl3plus2;

/**
 * 基于上面impl3plus版本的升级，可以让在handler链条随时中断,handler处理可以带返回值
 * @author lee
 */
public class Client {
    public static void main(String[] args) {
        //初始化各个处理器
        DepartmentHandler departmentHandler = new DepartmentHandler();
        CollegeHandler collegeHandler = new CollegeHandler();
        SchoolHandler schoolHandler = new SchoolHandler();

        //初始化处理器chain管理器
        PurchaseHandlerChain purchaseHandlerChain = new PurchaseHandlerChain();

        //注册管理器,顺序不能变，因为内部是用List实际就是数组来保存的各个处理器


        purchaseHandlerChain.registerHandler(schoolHandler);

        purchaseHandlerChain.registerHandler(collegeHandler);
        purchaseHandlerChain.registerHandler(departmentHandler);

        PurchaseRequest purchaseRequest = new PurchaseRequest(15500, "Book");

        String submit = purchaseHandlerChain.submit(purchaseRequest);
        System.out.println(submit);
    }
}
