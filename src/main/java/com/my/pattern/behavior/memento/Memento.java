package com.my.pattern.behavior.memento;

/**
 * 备忘录对象
 * 用于存储要保存的对象
 * @author lee
 * @version 1.0
 * @date 2020/11/11 11:07
 */
public class Memento {
    private Originator originator;

    public Memento() {
    }

    public Memento(Originator originator) {
        this.originator = originator;
    }

    public Originator getOriginator() {
        return originator;
    }

    public Memento setOriginator(Originator originator) {
        this.originator = originator;
        return this;
    }
}
