package com.my.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 18:27
 */
public class University extends OrganizationComponent{
    List<OrganizationComponent> organizations = new ArrayList<>();
    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizations.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizations.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("***********大学名称：" + getName() + "\t" + getDesc() + "***********");
        for (OrganizationComponent organization : organizations) {
            organization.print();
        }
    }
}
