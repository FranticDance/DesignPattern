package com.my.pattern.visitor;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/9 18:36
 */
public class PlayerA extends Visitor {

    @Override
    public void useYasuo(YasuoElement yasuoElement) {
        //实现自己的逻辑
        System.out.println("playerA使用亚索");
        //访问元素
        yasuoElement.releaseSkill();
    }

    @Override
    public void useLee(LeeElement leeElement) {
        //实现自己的逻辑
        System.out.println("playerA使用李青");
        //访问元素
        leeElement.releaseSkill();
    }
}
