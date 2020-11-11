package com.my.pattern.behavior.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/10 8:52
 */
public class ObjectStructure {
    private List<Element> list = new LinkedList<>();

    /**
     * 注册元素
     * @param element
     */
    public void add(Element element){
        list.add(element);
    }

    public void action(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}
