package com.my.pattern.strategy;

public class PLPlanB implements ProgrammingLanguage {
    @Override
    public void useLanguage() {
        System.out.println("PlanB，使用C#语言");
    }
}
