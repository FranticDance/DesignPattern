package com.my.pattern.behavior.strategy.demo1;

public class OsPlanB implements Os {
    @Override
    public void useOs() {
        System.out.println("采用的操作系统是CentOS");
    }
}
