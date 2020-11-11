package com.my.pattern.behavior.iterator;

/**
 * 专业类
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:39
 */
public class Profession {
    /**
     * 名称
     */
    String name;
    /**
     * 描述
     */
    String desc;

    public Profession(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public Profession setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Profession setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
