package com.my.pattern.visitor;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/9 18:17
 */
public class LeeElement extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.useLee(this);
    }

    public void releaseSkill(){
        System.out.println("李青放技能:断子绝孙脚");
    }
}
