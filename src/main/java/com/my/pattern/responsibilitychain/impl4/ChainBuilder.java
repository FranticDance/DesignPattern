package com.my.pattern.responsibilitychain.impl4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 *  这种方式是Dubbo中构建Filter责任链的方式，这里做一个简单模拟
 *  其特点是，通过Java匿名内部类和Final机制，遍历chain的处理器时，构建出链表结构，来使
 *  filter成链，这种机制下，每个节点，虽然没有显示的持有next引用，
 *  但是能达到相同的效果。老厉害了！
 *
 *  知识点延伸：匿名内部类、Final  ->匿名内部类内部若使用了外部局部变量，则该局部变量必须是final（JKD8取消了这个
 *  限制，但其实是编译器自己加的，相当于没变）  -> 闭包  -> Java编译器实现的只是capture-by-value，并没有实现capture-by-reference
 *
 */
public class ChainBuilder {
    private List<Handler> handlers;
    public Invoker buildInvokerChain(final Invoker invoker){
        Invoker last = invoker;
        if(handlers.size() > 0){
            for(int i = handlers.size() -1; i >=0; i--){
                final Handler handler = handlers.get(i);
                final Invoker next = last;
                last = new Invoker() {
                    //因为这里是匿名内部类，放一个name属性，在debug的时候比较好分辨是哪个内部类的实例，没有实际逻辑作用
                    String name = handler.getClass().getName();
                    @Override
                    public void invoke(PurchaseRequest purchaseRequest) {
                        handler.handle(next,purchaseRequest);
                    }
                };
            }
        }
        return last;
    }

    public void registerHandler(Handler handler){
        if(handlers == null){
            handlers = new ArrayList<>();
        }
        handlers.add(handler);
    }
}
