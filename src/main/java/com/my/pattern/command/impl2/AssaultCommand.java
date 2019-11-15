package com.my.pattern.command.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2019/11/15 15:37
 */
public class AssaultCommand extends AbstractCommand {
    public AssaultCommand(String command){
        super(new Infantry(), command);
    }
    public AssaultCommand(AbstractSoldier abstractSoldier, String command) {
        super(abstractSoldier,command);
    }

    @Override
    public void execute() {
        super.abstractSoldier.executeCommand(super.command);
    }
}
