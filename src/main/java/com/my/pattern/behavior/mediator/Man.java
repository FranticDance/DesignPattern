package com.my.pattern.behavior.mediator;

/**
 * 具体同事类
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:35
 */
public class Man extends Person{
    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void findCompanion(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().introduce(person);
    }
}
