package com.my.pattern.command.impl1;

/**
 * 具体的命令
 *
 * 封装炮兵进行炮击的命令
 */
public class BombardCommand extends Command{
    private Soldier soldier;
    private String command;
    public BombardCommand(Soldier soldier,String command) {
        this.command = command;
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.executeCommand(command);
    }
}
