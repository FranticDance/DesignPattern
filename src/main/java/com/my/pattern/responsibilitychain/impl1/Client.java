package com.my.pattern.responsibilitychain.impl1;

/**
 * @author lee
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest book = new PurchaseRequest(5000, "Book");
        //初始化各个处理器
        DepartmentHandler departmentHandler = new DepartmentHandler();
        CollegeHandler collegeHandler = new CollegeHandler();
        SchoolHandler schoolHandler = new SchoolHandler();
        //使处理器成为一个链条，这里可以考虑设置为环形链条，不然每次处理请求，都要从链条头部开始调用才行
        departmentHandler.setHandler(collegeHandler);
        collegeHandler.setHandler(schoolHandler);
        schoolHandler.setHandler(departmentHandler);

        //处理器处理请求

        //从链条中部开始执行
        collegeHandler.handle(book);
        //从链条头部开始执行
        //departmentHandler.handle(book);
        //从链条尾部开始执行
        //schoolHandler.handle(book);



    }
}
