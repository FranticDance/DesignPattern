package com.my.pattern.structure.composite;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 9:03
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("浙江大学", "一流大学");
        College college = new College("计算机学院", "专注软件与人工智能");
        College college1 = new College("物理学院", "国内一流物理学院");
        College college2 = new College("化学学院", "国内一流化学学院");
        university.add(college);
        university.add(college1);
        university.add(college2);

        college.add(new Department("软件工程", "专注软件开发"));
        college.add(new Department("云计算与大数据", "专注新热门的云计算与大数据"));

        college1.add(new Department("核物理", "专注理论核物理研究"));
        college1.add(new Department("量子物理", "专注量子领域"));

        college2.add(new Department("新材料科学", "专注研究新材料领域"));
        college2.add(new Department("无机化学", "专注无机方向"));

        university.print();

    }
}
