package com.my.pattern.behavior.observer.publishsubscribe;


public class Person<M> implements Subscriber<M> {
    private String name;


    @Override
    public void read(M msg, String publisherName) {
        System.out.println("我是" + name + ",我收到消息:" + ((News)msg).getContent());
    }

    @Override
    public void subscribe(PublishSubscribeCenter publishSubscribeCenter) {
        publishSubscribeCenter.subscribe(this);
    }

    @Override
    public void unSubscribe(PublishSubscribeCenter publishSubscribeCenter) {
        publishSubscribeCenter.unSubscribe(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
