package com.my.pattern.behavior.responsibilitychain.impl6;


import java.lang.reflect.InvocationTargetException;

/**
 * 采用动态代理的方式实现
 * @author lee
 * @version 1.0
 * @date 2020/3/19 16:29
 */
public class Client {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        PurchaseRequest book = new PurchaseRequest(6500, "Book");
        Target target = new TargetImpl();
        CollegeHandler collegeHandler = new CollegeHandler();
        DepartmentHandler departmentHandler = new DepartmentHandler();
        SchoolHandler schoolHandler = new SchoolHandler();
        Target schoolRegister = (Target)schoolHandler.register(target);
        Target collegeRegister = (Target)collegeHandler.register(schoolRegister);
        Target departRegister = (Target)departmentHandler.register(collegeRegister);
        departRegister.execute(book);

        /*LogInterceptor logInterceptor = new LogInterceptor();
        TransactionInterceptor transactionInterceptor = new TransactionInterceptor();
        Interceptor register = (Interceptor)logInterceptor.register(transactionInterceptor);
        register.intercept(new Invocation(null,null,null){
            @Override
            public Object procceed(){
                System.out.println("abc");
                return null;
            }
        });*/

    }
}
