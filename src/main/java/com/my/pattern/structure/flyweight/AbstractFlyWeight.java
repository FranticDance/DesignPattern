package com.my.pattern.structure.flyweight;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/24 9:17
 */
public abstract class AbstractFlyWeight {
    public String color;

    /**
     * 放棋子
     */
    public abstract void pointChess(int x, int y);

    public AbstractFlyWeight(String color) {
        this.color = color;
    }

    public void show(int x, int y){
        System.out.println("放了一个棋子:" + this.color + "(" + x + "," + y + ")");
    }

}
