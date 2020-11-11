package com.my.pattern.behavior.strategy;

public class PLPlanC implements ProgrammingLanguage {
    @Override
    public void useLanguage() {
        System.out.println("PlanC,使用PHP语言");
    }
}
