package com.my.pattern.structure.adapter.objectadapter;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/12 11:14
 */
public class ChargeAdapter implements Charge5V {
    Charge220V charge220V;

    public ChargeAdapter(Charge220V charge220V) {
        this.charge220V = charge220V;
    }

    @Override
    public int output5V() {
        int i = charge220V.output220v();
        return i / 45;
    }
}
