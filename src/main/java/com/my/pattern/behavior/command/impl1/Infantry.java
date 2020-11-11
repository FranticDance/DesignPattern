package com.my.pattern.behavior.command.impl1;

/**
 * 具体的命令执行者
 *
 * 步兵
 */
public class Infantry extends AbstractSoldier {
    @Override
    public void executeCommand(String command) {
        System.out.println("我是步兵，我收到命令：" + command + ",马上执行！！");
    }
}
