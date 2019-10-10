package com.my.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 分析：
 *      本例子需求是输出学院的员工id 和  学校总部的员工信息
 */

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工类
 */
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 学院员工类
 */
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeManager{
    public List<CollegeEmployee> getEmployee(){
        List<CollegeEmployee> collegeEmployees = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工，id = " + i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }
}

/**
 * 分析：
 *      根据迪米特原则的理论，一个类，出现在它成员变量，方法参数，方法返回值中的类，可以称之为直接朋友，
 *      而出现在局部变量的类，就是间接朋友。
 *      迪米特原则要求的就是，一个类应该只与直接朋友通信，而不应该和间接朋友通信。
 *      迪米特原则为什么要要求这么干呢？是为了降低类与类之间的耦合度。
 *
 *      在本例中，SchoolManager的printAllEmployee方法中出现了CollegeEmployee，而他是间接朋友，所以应当干掉。
 *      要干掉他，则说明要将打印CollegeEmployee信息的逻辑，移到CollegeManager中，printAllEmployee只是调用一下
 *      CollegeManager的方法。这样就可以满足迪米特法则。
 */
class SchoolManager{
    public List<Employee> getEmployee(){
        List<Employee> collegeEmployees = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setId("学校员工，id = " + i);
            collegeEmployees.add(employee);
        }
        return collegeEmployees;
    }

    public void printAllEmployee(CollegeManager collegeManager){
        List<CollegeEmployee> collegeEmployees = collegeManager.getEmployee();
        for (CollegeEmployee collegeEmployee : collegeEmployees) {
            System.out.println(collegeEmployee.getId());
        }

        List<Employee> employee = this.getEmployee();
        for (Employee employee1 : employee) {
            System.out.println(employee1.getId());
        }
    }
}
