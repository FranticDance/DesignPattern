package com.my.pattern.command.impl1;

/**
 * 执行者Invoker
 *
 * 传令兵
 */
public class OrderlyInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
