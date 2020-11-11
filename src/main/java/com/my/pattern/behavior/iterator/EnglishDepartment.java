package com.my.pattern.behavior.iterator;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:36
 */
public class EnglishDepartment<E> {
    private Profession [] professions;


    public MyIteratior<E> iteratior(){
        return new EnglishDepartmentIterator(professions);
    }


    public EnglishDepartment(Profession[] professions) {
        this.professions = professions;
    }
}
