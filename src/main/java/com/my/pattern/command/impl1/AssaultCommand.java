package com.my.pattern.command.impl1;

/**
 * 具体的命令
 * <p>
 * 封装士兵冲锋的命令
 */
public class AssaultCommand extends Command {
    private Soldier soldier;
    private String command;
    public AssaultCommand(Soldier soldier, String command) {
        this.soldier = soldier;
        this.command = command;
    }

    @Override
    public void execute() {
        soldier.executeCommand(command);
    }
}
