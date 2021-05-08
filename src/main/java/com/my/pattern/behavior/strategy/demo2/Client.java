package com.my.pattern.behavior.strategy.demo2;

/**
 * 直观演示策略模式
 * 因为此处变化点为，算法不同，并且可能会扩展，可能会替换。
 * 那么将算法抽离出来成为一个接口，并由具体的使用者(上下文对象)来使用
 * 那么上下文对象在使用的时候，就可以动态改变算法。
 * 其实不管对象适配器模式，装饰模式，静态代理模式，处处都是这种思想。将变化点抽取出来，成一个Interface或者抽象类，并由具体的使用者来持有。然后在
 * 实际使用的时候，才会动态改变究竟传哪个对象进去。
 * @author lee
 * @version 1.0
 * @date 2021/5/8 下午4:58
 */
public class Client {
    public static void main(String[] args) {
        YYKShop yykShop = new YYKShop();
        yykShop.setSale(new Sale75());
        yykShop.pay("T恤", 100);

        System.out.println("------------");

        yykShop.setSale(new Sale90());
        yykShop.pay("羽绒服", 600);
    }
}
