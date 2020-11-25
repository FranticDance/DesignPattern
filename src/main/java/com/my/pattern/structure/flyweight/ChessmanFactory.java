package com.my.pattern.structure.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/24 9:34
 */
public class ChessmanFactory {
    private static ChessmanFactory chessmanFactory = new ChessmanFactory();
    Map<String, AbstractFlyWeight> cache = new ConcurrentHashMap<>();

    private ChessmanFactory(){}

    public AbstractFlyWeight getChessmanObject(String type){
        AbstractFlyWeight abstractFlyWeight = cache.get(type);
        if (abstractFlyWeight == null) {
            switch (type){
                case "B" :
                    abstractFlyWeight = new BlackChessman("●");
                    break;
                case "W" :
                    abstractFlyWeight = new WhiteChessman("○");
                    break;
                default:
                    break;
            }
            cache.put(type, abstractFlyWeight);
        }
        return abstractFlyWeight;
    }

    public static ChessmanFactory getInstance(){
        return chessmanFactory;
    }
}
