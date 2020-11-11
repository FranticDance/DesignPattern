package com.my.pattern.behavior.observer.eventdriven;

import java.util.List;

public class GreenHouseControllers extends Controller{
    private boolean light = false;

    public class LightOn extends Event {
        LightOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            //这里插入物理开灯的代码
            light = true;
            System.out.println("灯打开了");
        }
    }
    public class LightOff extends Event {
        LightOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action() {
            //这里插入物理关灯的代码
            light = false;
            System.out.println("灯关闭了");
        }
    }

    private boolean water = false;
    public class WaterOn extends Event{
        WaterOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
            System.out.println("开水灌溉");
        }
    }

    public class WaterOff extends Event{
        WaterOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
            System.out.println("停止灌溉");
        }
    }

    public class Restart extends Event{
        private List<Event> eventList;

        Restart(long delayTime, List<Event> events){
            super(delayTime);
            eventList = events;

        }
        @Override
        public void action() {
            System.out.println("重启系统");
            for (Event event : eventList) {
                event.start();
                add(event);
            }
        }
    }
    public static class Terminate extends Event{
        Terminate(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            System.out.println("系统退出");
            System.exit(0);
        }
    }
}
