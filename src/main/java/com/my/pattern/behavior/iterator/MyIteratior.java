package com.my.pattern.behavior.iterator;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 16:33
 */
public interface MyIteratior<E> {
    boolean hasNext();

    E next();
}
