package com.my.pattern.behavior.command.impl1;

/**
 * 具体的命令
 *
 * 封装炮兵进行炮击的命令
 */
public class BombardCommand extends AbstractCommand {
    private AbstractSoldier soldier;
    private String command;
    public BombardCommand(AbstractSoldier soldier, String command) {
        this.command = command;
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.executeCommand(command);
    }
}
