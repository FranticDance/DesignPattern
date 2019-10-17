package com.my.pattern.responsibilitychain.impl3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 *
 * 这是另一种实现责任链的方式。Tomcat中执行servelet前的，执行过滤器链，就是这种方式
 * 这种方式的实现思路是，通过在chain内部持有一个每个chain处理器的集合或者数组，然后通过移动
 * 指针，来遍历chain，或者说滑动chain。
 */
public class PurchaseHandlerChain implements HandlerChain {
    /**
     * 当前执行handler的offset，即当前执行到第几个handler了
     */
    private int pos = 0;
    /**
     * 当前handler的总数量
     */
    private int number;

    private List<Handler> handlers;


    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if(pos < number){
            Handler handler = handlers.get(pos);
            pos ++;
            handler.handle(purchaseRequest, this);
        }else {
            System.out.println("chain上的handler都已处理完毕，进行下游处理，处理其他业务逻辑。。。");
        }
    }

    @Override
    public void registerHandler(Handler handler){
        if(handlers == null){
            handlers = new ArrayList<>();
        }
        handlers.add(handler);
        number = handlers.size();
    }

    @Override
    public void stopTraversal(){
        pos = number;
    }
}
