package com.my.pattern.behavior.strategy;

public class OsPlanC implements Os {
    @Override
    public void useOs() {
        System.out.println("采用的操作系统是Debian");
    }
}
