package com.my.pattern.observer;

public class Person implements Observer {
    private String name;

    @Override
    public void read(News news) {
        System.out.println("我是" + name + ",我正在读新闻:" + news.getTitle());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
