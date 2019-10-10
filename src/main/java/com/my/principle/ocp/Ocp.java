package com.my.principle.ocp;

/**
 * @author lee
 * 分析：
 *      本例子是一个简单的打印图形的例子
 *      但是下面这种实现违背了开放-封闭原则
 *      开放-封闭原则：对扩展开放，对修改关闭。其含义就是允许提供方对功能进行扩展，但是不要让使用方来修改。
 *      从另一个角度说，就是不要让使用方知道你提供方提供出来的功能的具体实现细节。
 *      要做到这一点，就要求写代码时：1.功能的具体实现细节不要放在使用方，应该内聚在提供方  2.由提供方提供接口，使用方来使用。
 *
 *      下面这个例子，Shape，Rectangle，Circle就是提供方，GraphEditor是使用方，但是功能的具体实现细节却在使用方，如果
 *      增加一个图形实现类，那么提供方、使用方都得做修改。
 */
public class Ocp {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        graphEditor.drawShape(rectangle);
        graphEditor.drawShape(circle);
    }
}

class Shape{
    int type;
}

class GraphEditor{
    public void drawShape(Shape shape){
        if(shape.type ==1){
            drawRectangle();
        }
        if(shape.type ==2){
            drawCircle();
        }
    }

    private void drawCircle() {
        System.out.println("绘制圆形");
    }

    private void drawRectangle() {
        System.out.println("绘制矩形");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}
