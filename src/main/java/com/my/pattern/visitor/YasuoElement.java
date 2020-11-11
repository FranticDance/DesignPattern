package com.my.pattern.visitor;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/9 18:14
 */
public class YasuoElement extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.useYasuo(this);
    }

    public void releaseSkill(){
        System.out.println("亚索释放技能:一顿乱砍斩");
    }
}
