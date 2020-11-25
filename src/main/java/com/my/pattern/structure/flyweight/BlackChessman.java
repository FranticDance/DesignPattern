package com.my.pattern.structure.flyweight;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/24 9:19
 */
public class BlackChessman extends AbstractFlyWeight{

    public BlackChessman(String color) {
        super(color);
        System.out.println("创建黑色棋子");
    }

    @Override
    public void pointChess(int x, int y) {
        show(x, y);
    }
}
