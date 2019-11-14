package com.my.pattern.command.impl1;

/**
 * 具体的命令执行者
 *
 * 炮兵
 */
public class Artillerymen extends Soldier{
    @Override
    public void executeCommand(String command) {
        System.out.println("我是炮兵，我收到命令：" + command + ",马上执行！！");
    }
}
