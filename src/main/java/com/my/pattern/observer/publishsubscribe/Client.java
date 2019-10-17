package com.my.pattern.observer.publishsubscribe;

public class Client {
    public static void main(String[] args) {
        PublishSubscribeCenter<News> newsPublishSubscribeCenter = new PublishSubscribeCenter<>();
        TTPublisher<News> msgTTPublisher = new TTPublisher<>("天天报社");
        Person<News> msgPersonA = new Person<>("personA");
        Person<News> msgPersonB = new Person<>("personB");

        newsPublishSubscribeCenter.subscribe(msgPersonA);
        newsPublishSubscribeCenter.subscribe(msgPersonB);

        News news = new News("奥运会", "奥运会要举行了");


        msgTTPublisher.publish(newsPublishSubscribeCenter, news, true);

    }
}
