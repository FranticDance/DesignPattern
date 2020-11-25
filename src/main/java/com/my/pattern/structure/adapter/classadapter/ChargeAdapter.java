package com.my.pattern.structure.adapter.classadapter;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/12 11:14
 */
public class ChargeAdapter extends Charge220V implements Charge5V {
    @Override
    public int output5V() {
        int i = output220v();
        return i / 45;
    }
}
