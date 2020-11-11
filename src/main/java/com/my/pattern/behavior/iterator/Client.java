package com.my.pattern.behavior.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/11 14:59
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();
        ArrayList<Profession> professions = new ArrayList<Profession>();
        professions.add(new Profession("词法分析", "中文词法分析"));
        professions.add(new Profession("歇后语", "中国歇后语大全"));
        professions.add(new Profession("成语", "中国成语大全"));
        ChineseDepartment<Profession> professionChineseDepartment = new ChineseDepartment<>(professions);

        Profession[] professions1 = new Profession[3];
        professions1[0] = new Profession("词法分析", "英文词法分析");
        professions1[1] = new Profession("谚语", "英文谚语大全");
        professions1[2] = new Profession("传奇人物故事", "英文传奇故事");
        EnglishDepartment<Profession> professionEnglishDepartment = new EnglishDepartment<>(professions1);

        MyIteratior iteratior = professionChineseDepartment.iteratior();
        while (iteratior.hasNext()){
            System.out.println(iteratior.next());
        }
        System.out.println("*************");
        MyIteratior<Profession> iteratior1 = professionEnglishDepartment.iteratior();
        while (iteratior1.hasNext()){
            System.out.println(iteratior1.next());
        }
    }
}
