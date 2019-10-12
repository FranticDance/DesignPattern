package com.my.pattern.observer;

/**
 * @author lee
 * 报社抽象接口
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
     * 发布新闻
     * @param news
     */
    void notifyObserver(News news);

}
