package com.my.pattern.responsibilitychain.impl6;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:02
 */
public class CollegeHandler implements Handler {
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        //System.out.println("日志拦截开始");
        Object[] args = invocation.args;
        PurchaseRequest purchaseRequest = null;
        for (int i = 0; i < args.length; i++) {
            purchaseRequest = (PurchaseRequest) args[i];
        }
        if (purchaseRequest.getPrice() <= 5000 && purchaseRequest.getPrice() > 1000) {
            System.out.println("院主任CollegeHandler will deal it");
            //return null;
            return invocation.procceed();
        } else {
            System.out.println("院主任不能处理，交给下一位");
            Object procceed = invocation.procceed();
            return procceed;
        }

        //return invocation.procceed();
    }

    public Object register(Object obj) {
        return TargetProxy.bind(obj, this);
    }
}
