package com.my.pattern.behavior.mediator;

/**
 * 抽象中介者
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:31
 */
public abstract class Mediator {
    //中介者,持有同事应用
    private Person man;
    private Person woman;
    public abstract void introduce(Person person);

    public Person getMan() {
        return man;
    }

    public Mediator setMan(Person man) {
        this.man = man;
        return this;
    }

    public Person getWoman() {
        return woman;
    }

    public Mediator setWoman(Person woman) {
        this.woman = woman;
        return this;
    }
}
