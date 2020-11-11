package com.my.pattern.behavior.responsibilitychain.impl1;

/**
 * @author lee
 * 责任链的一种实现方式，模板方式，书上讲的差不多都是这种。核心就是每一种处理器，自身内部都持有一个处理器的引用，当自身发现无法处理请求时，就将
 * 请求交给下一个处理器来处理。
 * 这里的抽象类，也可以改造为接口，将内部的Handler放到各自的处理器中去。就是简单的变形，核心思路没变，参考impl2包。
 *
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handle(PurchaseRequest purchaseRequest);

}
