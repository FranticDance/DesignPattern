package com.my.pattern.command.impl1;

/**
 * 将军客户端
 *
 * @author lee
 */
public class GeneralClient {
    public static void main(String[] args) {
        //创建一个传令兵
        OrderlyInvoker orderlyInvoker = new OrderlyInvoker();

        //创建步兵
        Infantry infantry = new Infantry();
        //创建冲锋命令
        AbstractCommand assaultCommand = new AssaultCommand(infantry, "向前冲锋500米");
        //下达命令
        orderlyInvoker.setCommand(assaultCommand);
        orderlyInvoker.action();


        //创建炮兵
        Artillerymen artillerymen = new Artillerymen();
        //创建命令
        AbstractCommand bombardCommand = new BombardCommand(artillerymen, "向目标诸元炮击");
        //下达命令
        orderlyInvoker.setCommand(bombardCommand);
        orderlyInvoker.action();
    }
}
