package com.my.pattern.structure.composite;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 9:02
 */
public class Department extends OrganizationComponent{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {

    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {

    }

    @Override
    public void print() {
        System.out.println("\t"+ "\t"  +"***********系名称" + getName() + "\t" + getDesc() + "***********");
    }
}
