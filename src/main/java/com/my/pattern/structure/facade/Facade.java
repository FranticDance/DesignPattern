package com.my.pattern.structure.facade;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/19 17:29
 */
public class Facade {
    public static void ready(){
        TV tv = new TV();
        tv.tvReady();
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.dvdReady();
        Light light = new Light();
        light.lightReady();
        Popcorn popcorn = new Popcorn();
        popcorn.popcoreReady();
    }
}
