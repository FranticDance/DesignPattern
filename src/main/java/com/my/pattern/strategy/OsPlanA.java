package com.my.pattern.strategy;

public class OsPlanA implements Os {
    @Override
    public void useOs() {
        System.out.println("部署的操作系统是Ubuntu");
    }
}
