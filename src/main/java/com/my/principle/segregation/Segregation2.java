package com.my.principle.segregation;


/**
 * 分拆之后
 */
public class Segregation2 {
}

interface Interface2_1{
    void operation1();
}
interface Interface2_2{
    void operation2();
    void operation3();
}
interface Interface2_3{
    void operation4();
    void operation5();
}

class B1 implements Interface2_1,Interface2_2{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}

class D1 implements Interface2_1,Interface2_3{

    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class A1 {
    public void depend1(Interface2_1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface2_2 interface1){
        interface1.operation2();
    }
    public void depend3(Interface2_2 interface1){
        interface1.operation3();
    }
}

class C1 {
    public void depend1(Interface2_1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface2_3 interface1){
        interface1.operation4();
    }
    public void depend5(Interface2_3 interface1){
        interface1.operation5();
    }
}