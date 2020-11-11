package com.my.pattern.behavior.observer.publishsubscribe;

/**
 * @author lee
 * 订阅者接口
 */
public interface Subscriber<M> {
    /**
     * 订阅者业务逻辑处理方法
     * @param msg
     * @param publisherName
     */
    void read(M msg, String publisherName);

    /**
     * 订阅
     * @param publishSubscribeCenter
     */
    void subscribe(PublishSubscribeCenter publishSubscribeCenter);

    /**
     * 取消订阅
     * @param publishSubscribeCenter
     */
    void unSubscribe(PublishSubscribeCenter publishSubscribeCenter);
}
