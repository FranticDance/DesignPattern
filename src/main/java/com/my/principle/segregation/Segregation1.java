package com.my.principle.segregation;

/**
 *
 * @author Administrator
 *
 * 如下所示
 *  Interface1 是一个接口，提供了 operation1，operation2，operation3，operation4，operation5 共5个方法
 *  类B，类D是Interface1的两个实现类，由于接口实现的特性，B，D两个类，必须实现Interface1中所有方法。
 *
 *  类A，通过Interface1，依赖了B类，但是只用到了operation1，operation2，operation3三个方法
 *  类C，通过Interface1，依赖了D类，但是只用到了operation1，operation4，operation5三个方法
 *
 *  但是可以看到，类B，也实现了A类用不到的operation4，operation5 两个方法。
 *  类D，也是实现了C类用不到的operation2，operation3 两个方法
 *
 *  按照接口隔离原则，一个类对另一个类的依赖应该建立在最小的接口上
 *  那么Interface1接口，就应该拆分，拆成三个接口，然后让B，D两个类
 *  分别只实现他们需要的接口。
 */
public class Segregation1 {

}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

class A {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}

class C {
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface1 interface1){
        interface1.operation4();
    }
    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}
