package com.my.pattern.behavior.mediator;

/**
 * 抽象同事类
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:32
 */
public abstract class Person {
    private String name;
    private int condition;
    public Mediator mediator;

    public Person(String name, int condition, Mediator mediator) {
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
    }

    public abstract void findCompanion(Person person);

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getCondition() {
        return condition;
    }

    public Person setCondition(int condition) {
        this.condition = condition;
        return this;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public Person setMediator(Mediator mediator) {
        this.mediator = mediator;
        return this;
    }
}
