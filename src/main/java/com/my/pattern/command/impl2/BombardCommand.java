package com.my.pattern.command.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2019/11/15 16:05
 */
public class BombardCommand extends AbstractCommand {
    public BombardCommand(String command){
        super(new Artillerymen(), command);
    }

    public BombardCommand(AbstractSoldier abstractSoldier, String command) {
        super(abstractSoldier, command);
    }

    @Override
    public void execute() {
        super.abstractSoldier.executeCommand(super.command);
    }
}
