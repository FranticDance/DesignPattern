package com.my.pattern.strategy;

public class OsPlanB implements Os {
    @Override
    public void useOs() {
        System.out.println("采用的操作系统是CentOS");
    }
}
