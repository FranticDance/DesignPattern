package com.my.pattern.mediator;

/**
 * 具体同事类
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:37
 */
public class Woman extends Person{

    public Woman(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void findCompanion(Person person) {
        this.getMediator().setWoman(this);
        this.getMediator().introduce(person);
    }
}
