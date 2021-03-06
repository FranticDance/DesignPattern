package com.my.pattern.behavior.command.impl1;

/**
 * 执行者Invoker
 *
 * 传令兵
 */
public class OrderlyInvoker {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
