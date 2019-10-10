package com.my.principle.singleprinciple;

/**
 * @author Administrator
 *
 * 将交通工具类分拆为多个类，各自负责各自的逻辑。
 *
 * 此种方案的分析：
 *      1.遵守了单一职责原则
 *      2.但是这样做开销比较大，需要将类分解，修改的代码可能比较多
 *      3.改进：直接修改最原始的Vehicle类，这样改动会比较小。（但是这样做是有前提的，
 *              即需要改动类，他本身方法较少，逻辑较简单，并且方法之间没有什么交叉关系。如果
 *              不满足这个前提，依然要分拆。）
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("汽车");
        airVehicle.run("飞机");
        waterVehicle.run("轮船");
    }
}


class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空上运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水上运行");
    }
}
