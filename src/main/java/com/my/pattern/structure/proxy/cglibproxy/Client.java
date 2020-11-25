package com.my.pattern.structure.proxy.cglibproxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:37
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(teacher);
        Teacher instance = (Teacher) cglibProxyFactory.getInstance();
        instance.teach();
    }
}
