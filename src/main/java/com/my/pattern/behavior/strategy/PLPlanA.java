package com.my.pattern.behavior.strategy;

public class PLPlanA implements ProgrammingLanguage {
    @Override
    public void useLanguage() {
        System.out.println("PlanA，使用Java语言");
    }
}
