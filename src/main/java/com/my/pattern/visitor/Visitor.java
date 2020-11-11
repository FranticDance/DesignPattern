package com.my.pattern.visitor;

/**
 * 定义抽象访问者
 * @author lee
 * @version 1.0
 * @date 2020/11/9 17:35
 */
public abstract class Visitor {
    public abstract void useYasuo(YasuoElement yasuoElement);
    public abstract void useLee(LeeElement leeElement);
}
