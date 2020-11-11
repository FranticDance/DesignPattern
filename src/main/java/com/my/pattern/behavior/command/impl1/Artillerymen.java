package com.my.pattern.behavior.command.impl1;

/**
 * 具体的命令执行者
 *
 * 炮兵
 */
public class Artillerymen extends AbstractSoldier {
    @Override
    public void executeCommand(String command) {
        System.out.println("我是炮兵，我收到命令：" + command + ",马上执行！！");
    }
}
