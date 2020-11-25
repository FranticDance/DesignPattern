package com.my.pattern.structure.proxy.dynamicproxy;

import com.my.pattern.structure.proxy.staticproxy.TeacherProxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:37
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        DynamicProxyFactory dynamicProxyFactory = new DynamicProxyFactory(teacher);
        ITeache teacherProxy = (ITeache) dynamicProxyFactory.getProxyInstance();
        teacherProxy.teach();
    }
}
