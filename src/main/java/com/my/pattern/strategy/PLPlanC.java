package com.my.pattern.strategy;

public class PLPlanC implements ProgrammingLanguage {
    @Override
    public void useLanguage() {
        System.out.println("PlanC,使用PHP语言");
    }
}
