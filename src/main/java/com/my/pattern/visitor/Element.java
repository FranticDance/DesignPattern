package com.my.pattern.visitor;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/9 18:11
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
