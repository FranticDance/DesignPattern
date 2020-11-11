package com.my.pattern.behavior.responsibilitychain.impl6;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:02
 */
public class SchoolHandler implements Handler {
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        //System.out.println("日志拦截开始");
        Object[] args = invocation.args;
        PurchaseRequest purchaseRequest = null;
        for (int i = 0; i < args.length; i++) {
            purchaseRequest = (PurchaseRequest) args[i];
        }
        if (purchaseRequest.getPrice() >= 5000) {
            System.out.println("校主任CollegeHandler will deal it");
            return invocation.procceed();
        } else {
            System.out.println("校主任不能处理，交给下一位");
            Object procceed = invocation.procceed();
            return procceed;
        }

        //return invocation.procceed();
    }

    public Object register(Object obj) {
        return TargetProxy.bind(obj, this);
    }

    @Override
    public String toString() {
        return "SchoolHandler{}";
    }
}
