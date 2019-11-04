package com.my.pattern.observer.eventdriven;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制器
 * 用于管理事件，执行事件
 */
public class Controller {

    private List<Event> eventList = new ArrayList<>();

    /**
     * 循环执行事件，执行过的事件被移除出容器
     */
    public void run(){
        while (eventList.size() > 0){
            //这里要避免循环list中移除元素造成的写异常
            for (Event event : new ArrayList<>(eventList)) {
                if(event.ready()){
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }

    /**
     * 增加一个事件
     * @param event
     */
    public void add(Event event){
        eventList.add(event);
    }


}
