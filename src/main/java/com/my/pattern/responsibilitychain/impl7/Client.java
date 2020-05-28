package com.my.pattern.responsibilitychain.impl7;

import com.my.pattern.responsibilitychain.impl6.PurchaseRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/20 9:42
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest book = new PurchaseRequest(11, "book");
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new LogInterceptor());
        interceptors.add(new TransactionInterceptor());
        InterceptorChain interceptorChain = new InterceptorChain(interceptors);

        TargetImpl target = new TargetImpl();
        Target t = (Target)interceptorChain.registerAll(target);
        t.execute(book);
    }
}
