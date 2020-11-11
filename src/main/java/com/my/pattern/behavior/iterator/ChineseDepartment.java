package com.my.pattern.behavior.iterator;

import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:36
 */
public class ChineseDepartment<E> {
    List<Profession> professions;

    public MyIteratior<E> iteratior(){
        return new ChineseDepartmentIterator(professions);
    }

    public ChineseDepartment(List<Profession> professions) {
        this.professions = professions;
    }
}
