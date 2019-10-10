package com.my.principle.singleprinciple;

/**
 * @author lee
 *
 * 此种方案，直接修改Vehicle类，分别提供3个方法处理不同的逻辑。
 * 虽然没有在类的级别上遵守单一职责原则，但是在方法的级别上遵守了单一职责原则。
 * 但是这样操作的前提是，Vehicle类的方法数量较少，逻辑比较简单，方法之间也没什么交叉调用。
 * 否则，也要像第二种方法一样，将Vehicle分拆为类级别的单一职责原则。
 *
 * 其实这种方法经常见，最经典的例子，就是DAO，我们的Dao层，就是在方法级别上的单一职责原则。
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("汽车");
        vehicle2.runWater("轮船");
    }
}

class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水上运行");
    }

}
