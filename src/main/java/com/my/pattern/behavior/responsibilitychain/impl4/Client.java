package com.my.pattern.behavior.responsibilitychain.impl4;

/**
 * @author lee
 */
public class Client {
    public static void main(String[] args) {
        //初始化各个处理器
        DepartmentHandler departmentHandler = new DepartmentHandler();
        CollegeHandler collegeHandler = new CollegeHandler();
        SchoolHandler schoolHandler = new SchoolHandler();

        //注册handler
        ChainBuilder chainBuilder = new ChainBuilder();
        chainBuilder.registerHandler(departmentHandler);
        chainBuilder.registerHandler(collegeHandler);
        chainBuilder.registerHandler(schoolHandler);

        Invoker invoke = chainBuilder.buildInvokerChain(new Invoker() {
            String name = "EndInvoker";
            @Override
            public void invoke(PurchaseRequest purchaseRequest) {
                System.out.println("chain上的handler都已处理完毕，进行下游处理，处理其他业务逻辑。。。");
            }
        });

        PurchaseRequest book = new PurchaseRequest(5000, "Book");
        invoke.invoke(book);
    }
}
