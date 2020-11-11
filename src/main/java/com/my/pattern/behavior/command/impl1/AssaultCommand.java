package com.my.pattern.behavior.command.impl1;

/**
 * 具体的命令
 * <p>
 * 封装士兵冲锋的命令
 */
public class AssaultCommand extends AbstractCommand {
    private AbstractSoldier soldier;
    private String command;
    public AssaultCommand(AbstractSoldier soldier, String command) {
        this.soldier = soldier;
        this.command = command;
    }

    @Override
    public void execute() {
        soldier.executeCommand(command);
    }
}
