package com.my.pattern.responsibilitychain.impl7;

import com.my.pattern.responsibilitychain.impl6.PurchaseRequest;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/19 17:02
 */
public class LogInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
       /* System.out.println("日志拦截开始");
        return invocation.procceed();*/

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
    }

}
