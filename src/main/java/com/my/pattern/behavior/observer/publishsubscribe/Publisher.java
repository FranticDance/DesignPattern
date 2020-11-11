package com.my.pattern.behavior.observer.publishsubscribe;

/**
 * @author lee
 * 报社抽象接口，发布者抽象接口
 */
public interface Publisher<M> {

    /**
     * 发布消息
     */
    void publish(PublishSubscribeCenter publishSubscribeCenter, M msg, boolean isInstantMsg);

}
