package com.my.pattern.structure.flyweight;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/24 9:19
 */
public class WhiteChessman extends AbstractFlyWeight{

    public WhiteChessman(String color) {
        super(color);
        System.out.println("创建白色棋子");
    }

    @Override
    public void pointChess(int x, int y) {
        show(x,y);
    }
}
