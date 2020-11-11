package com.my.pattern.visitor;

/**
 * 访问者设计模式
 * @author lee
 * @version 1.0
 * @date 2020/11/10 8:51
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        LeeElement leeElement = new LeeElement();
        YasuoElement yasuoElement = new YasuoElement();
        objectStructure.add(leeElement);
        objectStructure.add(yasuoElement);

        PlayerA playerA = new PlayerA();
        PlayerB playerB = new PlayerB();

        objectStructure.action(playerA);
        System.out.println("**************");
        objectStructure.action(playerB);
    }
}
