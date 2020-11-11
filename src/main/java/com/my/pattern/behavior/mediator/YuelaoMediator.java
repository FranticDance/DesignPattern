package com.my.pattern.behavior.mediator;

/**
 * 具体中介者
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:33
 */
public class YuelaoMediator extends Mediator{
    /**
     * 具体的业务逻辑
     * @param person
     */
    @Override
    public void introduce(Person person) {
        if(person instanceof Woman){
            this.setWoman(person);
        }
        if(person instanceof Man){
            this.setMan(person);
        }
        if(this.getMan() == null ||  this.getWoman() == null){
            System.out.println("oh no");
            return;
        }
        if (this.getWoman().getCondition() == this.getMan().getCondition()) {
            System.out.println(this.getMan().getName() + "和" + this.getWoman().getName() + "很合适");
            return;
        }else {
            System.out.println(this.getMan().getName() + "和" + this.getWoman().getName() + "不合适");
            return;
        }

    }
}
