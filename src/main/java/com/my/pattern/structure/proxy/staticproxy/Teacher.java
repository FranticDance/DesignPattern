package com.my.pattern.structure.proxy.staticproxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:17
 */
public class Teacher implements ITeache{
    @Override
    public void teach() {
        System.out.println("老师教书...");
    }
}
