package com.my.pattern.responsibilitychain.impl3;

public interface HandlerChain {
    /**
     * 移动内部handler指针，调用handler的方法
     * @param purchaseRequest
     */
    void process(PurchaseRequest purchaseRequest);

    /**
     * 用于停止责任链的遍历的开关
     */
    void stopTraversal();

    /**
     * 注册处理器
     * @param handler
     */
    void registerHandler(Handler handler);
}
