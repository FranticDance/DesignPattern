package com.my.pattern.observer.observer;

/**
 * @author lee
 * 报社抽象接口，被观察者抽象接口
 */
public interface Publisher {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
