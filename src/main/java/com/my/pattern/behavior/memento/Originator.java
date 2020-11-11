package com.my.pattern.behavior.memento;

/**
 * 发起者，需要被保存状态的对象
 *
 * @author lee
 * @version 1.0
 * @date 2020/11/11 11:03
 */
public class Originator {
    private int blood = 0;

    private String rival;
    public Originator(int blood) {
        this.blood = blood;
    }

    public void fight(int blood, String rival) {
        this.rival = rival;
        this.blood = this.blood - blood;
        if (this.blood < 0) {
            this.blood = 0;
        }
        System.out.println("与"+ rival + "遭遇,经历一场大战,剩余血量" + (this.blood));
    }

    public Memento save(){
        Originator originator = new Originator(this.blood);
        originator.setRival(this.getRival());
        return new Memento(originator);
    }

    public void load(Memento memento){
        this.setRival(memento.getOriginator().getRival());
        this.setBlood(memento.getOriginator().getBlood());
    }

    public int getBlood() {
        return blood;
    }

    public Originator setBlood(int blood) {
        this.blood = blood;
        return this;
    }

    public String getRival() {
        return rival;
    }

    public Originator setRival(String rival) {
        this.rival = rival;
        return this;
    }
}
