package com.my.pattern.structure.adapter.classadapter;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/12 11:10
 */
public class Phone {
    public void charging(Charge5V charge5V){
        int i = charge5V.output5V();
        if(i >= 5){
            System.out.println("电压大于5V,不可充电");
        }else {
            System.out.println("可以充电");
        }
    }

}
