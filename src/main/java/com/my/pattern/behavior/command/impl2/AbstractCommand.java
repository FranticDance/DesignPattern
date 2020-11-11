package com.my.pattern.behavior.command.impl2;

/**
 * 抽象命令类
 * @author lee
 */
public abstract class AbstractCommand {
    protected final AbstractSoldier abstractSoldier;
    protected final String command;
    public AbstractCommand(AbstractSoldier abstractSoldier, String command){
        this.abstractSoldier = abstractSoldier;
        this.command = command;
    }

    public abstract void execute();
}
