package com.my.pattern.memento;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 11:14
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator(100);

        originator.fight(20, "德军");
        caretaker.setMemento(originator.save());
        originator.fight(10, "意军");
        caretaker.setMemento( originator.save());
        originator.fight( 80,"英军");

        if(originator.getBlood() == 0){
            System.out.println("英军太厉害打不过,读档重来");
            originator.load(caretaker.getMemento("意军"));
            System.out.println("读档成功,此时敌人是:" + originator.getRival());
            System.out.println("读档成功,此时血量是:" + originator.getBlood());
        }

    }
}
