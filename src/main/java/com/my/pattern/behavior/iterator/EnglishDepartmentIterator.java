package com.my.pattern.behavior.iterator;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:35
 */
public class EnglishDepartmentIterator<E> implements MyIteratior {
    E[] professions;
    int cursor = -1;

    public EnglishDepartmentIterator(E[] professions) {
        this.professions = professions;
    }

    @Override
    public boolean hasNext() {
        if (cursor >= professions.length - 1) {
            return false;
        } else {
            cursor++;
            return true;
        }
    }

    @Override
    public E next() {
        return professions[cursor];
    }


}
