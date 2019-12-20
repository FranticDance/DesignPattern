package com.my.pattern.responsibilitychain.impl3plus2;



import java.util.List;

public abstract class HandlerChain {
    /**
     * 当前执行handler的offset，即当前执行到第几个handler了
     */
    protected int pos = 0;
    /**
     * 当前handler的总数量
     */
    protected int number;

    protected List<Handler> handlers;

    /**
     * 提交任务
     * @param purchaseRequest
     */
    abstract String submit(PurchaseRequest purchaseRequest);


    /**
     * 移动内部handler指针，调用handler的方法
     * @param purchaseRequest
     * @param isStopTraversal 当执行某个handler后，是否将请求继续交给下一个handler
     * @return
     */
    protected abstract String process(PurchaseRequest purchaseRequest, boolean isStopTraversal);

    /**
     * 用于停止责任链的遍历的开关
     */
    abstract void stopTraversal();

    /**
     * 注册处理器
     * @param handler
     */
    abstract void registerHandler(Handler handler);
}
