package com.my.pattern.observer.publishsubscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class PublishSubscribeCenter<M> {
    private final int QUEUE_CAPACITY = 10;
    /**
     * 发布订阅中心消息存储队列
     */
    private BlockingQueue<Msg> queue = new ArrayBlockingQueue(QUEUE_CAPACITY);


    private List<Subscriber> subscriberList = new ArrayList<>();

    public void publish(String publisherName, M msg, boolean isInstantSend){
        //如果是立即发送
        if(isInstantSend){
            notifySubscribe(publisherName,msg);
            return;
        }
        //非立即发送,将消息封装为Msg，存储在队列中
        Msg<M> storeMsg = new Msg<M>(publisherName, msg);
        //若存储队列已满，则直接发送消息
        if(!queue.offer(storeMsg)){
            try {
                notifySubscribe();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void notifySubscribe() throws Exception{
        Msg m = null;
        while ((m = queue.poll(1, TimeUnit.SECONDS)) != null){
            notifySubscribe(m.getPublisher(), (M)m.getMsg());
        }
    }

    /**
     * 通知订阅者
     * @param publisherName
     * @param msg
     */
    private void notifySubscribe(String publisherName, M msg) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.read(msg, publisherName);
        }
    }


    public void subscribe(Subscriber subscriber){
        if(!subscriberList.contains(subscriber)){
            subscriberList.add(subscriber);
        }
    }

    public void unSubscribe(Subscriber subscriber){
        if(subscriberList.contains(subscriber)){
            subscriberList.remove(subscriber);
        }
    }
}
