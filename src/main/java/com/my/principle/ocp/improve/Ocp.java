package com.my.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Rectangle());
        graphEditor.drawShape(new Circle());
    }
}

class GraphEditor{
    public void drawShape(Shape shape){
        shape.draw();
    }
}

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    int type =1;
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle implements Shape{
    int type =2;
    public void draw() {
        System.out.println("绘制圆形");
    }
}
