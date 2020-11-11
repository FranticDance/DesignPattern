package com.my.pattern.behavior.iterator;

import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:35
 */
public class ChineseDepartmentIterator<E> implements MyIteratior<E>{
    List<E> professionList;
    int cursor = -1;

    public ChineseDepartmentIterator(List<E> professionList) {
        this.professionList = professionList;
    }

    @Override
    public boolean hasNext() {
        if(cursor >= professionList.size() - 1){
            return false;
        }else {
            cursor ++;
            return true;
        }
    }

    @Override
    public E next() {
        return professionList.get(cursor);
    }
}
