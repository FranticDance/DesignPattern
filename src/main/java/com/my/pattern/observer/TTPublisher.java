package com.my.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 * 被观察者，天天报社
 */
public class TTPublisher implements Publisher {
    /**
     * 存放观察者
     */
    private List<Observer> observerList = new ArrayList<Observer>();


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver(News news) {
        System.out.println(this.getClass().getSimpleName() + "发布新闻:" + news.getTitle());
        for (Observer observer : observerList) {
            observer.read(news);
        }
    }
}
