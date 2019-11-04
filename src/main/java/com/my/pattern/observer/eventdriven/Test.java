package com.my.pattern.observer.eventdriven;

import java.util.ArrayList;

/**
 * 事件驱动，Java编程思想中，又叫控制框架
 */
public class Test {
    public static void main(String[] args) {
        //创建控制器
        GreenHouseControllers greenHouseControllers = new GreenHouseControllers();
        //在控制器中加入若干事件
        GreenHouseControllers.LightOn lightOn = greenHouseControllers.new LightOn(1000);
        greenHouseControllers.add(lightOn);
        ArrayList<Event> events = new ArrayList<>();
        events.add(greenHouseControllers.new LightOff(1000));
        events.add(greenHouseControllers.new WaterOn(3000));
        events.add(greenHouseControllers.new WaterOff(3000));
        GreenHouseControllers.Restart restart = greenHouseControllers.new Restart(6000, events);
        greenHouseControllers.add(restart);

        greenHouseControllers.run();
    }
}
