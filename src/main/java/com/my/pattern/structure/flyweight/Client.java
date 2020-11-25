package com.my.pattern.structure.flyweight;

import java.util.Random;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/24 14:14
 */
public class Client {
    public static void main(String[] args) {
        ChessmanFactory chessmanFactory = ChessmanFactory.getInstance();
        Random random = new Random();
        int type = 0;
        AbstractFlyWeight abstractFlyWeight = null;
        for (int i = 0; i < 10; i++) {
            type = random.nextInt(2);
            switch (type){
                case 0:
                    abstractFlyWeight = chessmanFactory.getChessmanObject("B");
                    break;
                case 1:
                    abstractFlyWeight = chessmanFactory.getChessmanObject("W");
                    break;
                default:
                    break;
            }
            System.out.println(abstractFlyWeight);
            abstractFlyWeight.pointChess(i, random.nextInt(20));
            System.out.println("*************");
        }
    }
}
