package com.my.pattern.structure.adapter.classadapter;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/12 11:15
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new ChargeAdapter());
    }
}
