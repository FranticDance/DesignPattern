package com.my.pattern.observer.publishsubscribe;

public class TTPublisher<M>  implements Publisher<M>{
    /**
     * 发布者名称
     */
    private String name;

    public TTPublisher() {
    }

    public TTPublisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 发布者发布消息
     * @param publishSubscribeCenter
     * @param msg
     * @param isInstantSend 是否立即发送给订阅者
     */
    @Override
    public void publish(PublishSubscribeCenter publishSubscribeCenter, M msg, boolean isInstantSend) {
        publishSubscribeCenter.publish(name, msg, isInstantSend);
    }

}
