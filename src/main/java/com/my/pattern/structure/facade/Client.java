package com.my.pattern.structure.facade;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/19 17:26
 */
public class Client {
    public static void main(String[] args) {
        //不使用外观模式
        test();

        //使用外观模式
        test2();
    }

    /**
     * 不使用外观模式的写法
     */
    public static void test(){
        TV tv = new TV();
        tv.tvReady();
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.dvdReady();
        Light light = new Light();
        light.lightReady();
        Popcorn popcorn = new Popcorn();
        popcorn.popcoreReady();
    }

    public static void test2(){
        Facade.ready();
    }

}
