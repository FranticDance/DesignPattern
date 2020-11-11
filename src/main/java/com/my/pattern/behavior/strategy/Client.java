package com.my.pattern.behavior.strategy;

/***
 * @author Administrator
 * 策略模式
 * 当一个功能，有多个实现时，那么这个功能就是一个变化点，可以考虑使用策略模式将之封装，
 * 然后将策略接口以成员变量的方式聚合到要使用的类中。
 * 这样可以更加灵活，并且还可以随时切换使用哪一个实现算法。
 *
 * JDK中的Arrays.sort方法中就应用了策略模式，我们在调用的时候传入的Comparator，就相当于具体的算法实现
 */
public class Client {
    public static void main(String[] args) {
        BookStoreWebProgram bookStoreWebProgram = new BookStoreWebProgram("天天书店", new OsPlanA(), new PLPlanA());
        bookStoreWebProgram.open();
        System.out.println("重新选择语言了");
        bookStoreWebProgram.setProgrammingLanguage(new PLPlanB());
        bookStoreWebProgram.open();

        System.out.println("---------------------------------");
        //当使用lambda表达式时，Os和ProgrammingLanguage子类就都可以不用定义了。就像使用Arrays.sort方法一样。如此可以减少类的数量
        BookStoreWebProgram bookStoreWebProgram2 = new BookStoreWebProgram("月月书店",
                () ->System.out.println("部署的操作系统是国产系统"), () -> System.out.println("选择的是国产编程语言"));
        bookStoreWebProgram2.open();
    }
}
