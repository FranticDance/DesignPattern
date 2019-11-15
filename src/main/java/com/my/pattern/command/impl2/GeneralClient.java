package com.my.pattern.command.impl2;

/**
 *
 * 将军客户端
 *
 * @author lee
 * @version 1.0
 * @date 2019/11/15 16:28
 */
public class GeneralClient {
    public static void main(String[] args) {

        OrderlyInvoker orderlyInvoker = new OrderlyInvoker();
        orderlyInvoker.setAbstractCommand(new AssaultCommand("向前冲锋500米"));
        orderlyInvoker.action();

        orderlyInvoker.setAbstractCommand(new BombardCommand("向目标诸元炮击"));
        orderlyInvoker.action();
    }
}
