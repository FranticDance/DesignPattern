package com.my.pattern.behavior.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 守护者
 * 用于管理备忘录对象
 *
 * @author lee
 * @version 1.0
 * @date 2020/11/11 11:09
 */
public class Caretaker {
    private Map<String, Memento> mementoMap = new HashMap<>();

    public void setMemento(Memento memento) {
        String rival = memento.getOriginator().getRival();
        mementoMap.put(rival, memento);
    }

    public Memento getMemento(String rival){
        return mementoMap.get(rival);
    }
}
