package com.my.pattern.responsibilitychain.impl4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 *
 *
 */
public class ChainBuilder {
    private List<Handler> handlers;
    public Invoker buildInvokerChain(final Invoker invoker){
        Invoker last = invoker;
        if(handlers.size() > 0){
            for(int i = handlers.size() -1; i >=0; i--){
                final Handler handler = handlers.get(i);
                final Invoker next = last;
                last = new Invoker() {
                    //因为这里是匿名内部类，放一个name属性，在debug的时候比较好分辨是哪个内部类的实例，没有实际逻辑作用
                    String name = handler.getClass().getName();
                    @Override
                    public void invoke(PurchaseRequest purchaseRequest) {
                        handler.handle(next,purchaseRequest);
                    }
                };
            }
        }
        return last;
    }

    public void registerHandler(Handler handler){
        if(handlers == null){
            handlers = new ArrayList<>();
        }
        handlers.add(handler);
    }
}
