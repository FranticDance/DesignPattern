package com.my.pattern.observer;

/**
 * @author lee
 */
public class Client {
    public static void main(String[] args) {
        //初始化被观察者
        TTPublisher ttPublisher = new TTPublisher();
        //初始化观察者
        Person personA = new Person("小红");
        Person personB = new Person("小强");
        Person personC = new Person("小王");
        //注册观察者
        ttPublisher.registerObserver(personA);
        ttPublisher.registerObserver(personB);
        ttPublisher.registerObserver(personC);

        //创建消息
        News news = new News("奥运会开幕式", "");
        ttPublisher.notifyObserver(news);
    }
}
