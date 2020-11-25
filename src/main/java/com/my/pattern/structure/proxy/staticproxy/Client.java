package com.my.pattern.structure.proxy.staticproxy;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/25 14:20
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        teacherProxy.teach();
    }
}
