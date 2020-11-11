package com.my.pattern.behavior.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:07
 */
public abstract class State {

    public abstract void waitTask();

    public abstract boolean runTask();

    public abstract void runSuccess();

    public abstract void runFail();
}
