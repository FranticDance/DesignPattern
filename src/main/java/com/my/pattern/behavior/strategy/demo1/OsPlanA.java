package com.my.pattern.behavior.strategy.demo1;

public class OsPlanA implements Os {
    @Override
    public void useOs() {
        System.out.println("部署的操作系统是Ubuntu");
    }
}
