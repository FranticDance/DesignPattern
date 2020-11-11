package com.my.pattern.behavior.observer.eventdriven;

/**
 * 定义事件
 * 基于时间控制时间，因此使用抽象类，来同时持有成员和抽象方法
 */
public abstract class Event {
    /**
     * 事件触发事件
     */
    private long eventTime;
    protected long delayTime;

    /**
     * 从对象创建开始计算时间
     * 时间触发事件为 对象创建事件+延迟事件
     * @param delayTime
     */
    Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        //eventTime = System.nanoTime() + delayTime;
        eventTime = System.currentTimeMillis() + delayTime;
    }

    /**
     * 当当前时间大于等于触发时间时，事件准备执行
     * @return
     */
    public boolean ready(){
        //return System.nanoTime() >= eventTime;
        return System.currentTimeMillis() >= eventTime;
    }

    public abstract void action();

}
