package com.my.pattern.behavior.responsibilitychain.impl3plus2;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author lee
 * 定义处理某种业务的具体责任链，可以根据实际情况进行扩展
 *
 * 这是另一种实现责任链的方式。Tomcat中执行servelet前的，执行过滤器链，就是这种方式
 * 这种方式的实现思路是，通过在chain内部持有一个每个chain处理器的集合或者数组，然后通过移动
 * 指针，来遍历chain，或者说滑动chain。
 */
public class PurchaseHandlerChain extends HandlerChain {

    /**
     * 提交任务
     * @param purchaseRequest
     */
    @Override
    public String submit(PurchaseRequest purchaseRequest) {
        return process(purchaseRequest, false);
    }

    @Override
    public String process(PurchaseRequest purchaseRequest, boolean isStopTraversal) {
        if(isStopTraversal){
            stopTraversal();
        }
        if(pos < number){
            Handler handler = handlers.get(pos);
            pos ++;
            String handle = handler.handle(purchaseRequest, this);
            return handle;
        }else {
            System.out.println("chain上的handler都已处理完毕，如有需要，可以进行下游处理，处理其他业务逻辑。。。");
            return null;
        }
    }

    @Override
    public void registerHandler(Handler handler){
        //TODO 此处可能有多线程安全问题，可考虑加锁处理
        if(handlers == null){
            handlers = new CopyOnWriteArrayList<>();
        }
        handlers.add(handler);
        number = handlers.size();
    }

    @Override
    public void stopTraversal(){
        pos = number;
    }
}
