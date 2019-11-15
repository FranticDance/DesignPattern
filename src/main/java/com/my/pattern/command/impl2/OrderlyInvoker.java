package com.my.pattern.command.impl2;

/**
 * @author lee
 * @version 1.0
 * @date 2019/11/15 16:29
 */
public class OrderlyInvoker {

    private AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public void action(){
        abstractCommand.execute();
    }

}
