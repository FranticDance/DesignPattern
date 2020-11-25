package com.my.pattern.structure.composite;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 18:23
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public abstract void add(OrganizationComponent organizationComponent);
    public abstract void remove(OrganizationComponent organizationComponent);
    public abstract void print();


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
