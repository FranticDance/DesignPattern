package com.my.pattern.structure.proxy.staticproxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:18
 */
public class TeacherProxy implements ITeache{
    ITeache iTeache;

    public TeacherProxy(ITeache iTeache) {
        this.iTeache = iTeache;
    }

    @Override
    public void teach() {
        System.out.println("为了增强老师的效率，减轻负担，为老师提供电脑设备..");
        iTeache.teach();
    }
}
