package com.my.principle.singleprinciple;

/**
 * @author Administrator
 * Vehicle类提供了一个run方法，但是不同的交通工具，有不同的运行方式。
 * 因此，不能让一个run方法，负责所有交通工具的运行职责。 并且，不能说
 * 在run方法，用if等判断条件去判断什么交通工具用什么处理逻辑。这样一旦
 * 逻辑复杂之后，这个run方法将很难维护，而且将有很多原因导致这个方法发生
 * 变化。
 * 因此此处应当遵守单一职责原则。将类分拆。
 * 单一职责原则：就一个类而言，应该仅有一个引起它变化的原因。
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}


class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行。。。");
    }
}