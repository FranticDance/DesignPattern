package com.my.pattern.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:14
 */
public class TaskRunner {
    State state = null;
    TaskStatus taskStatus;

    State waitState = new WaitTaskState(this);
    State runState = new RunTaskState(this);
    State runSuccessState = new RunSuccessState(this);
    State runFailState = new RunFailState(this);

    public TaskRunner(){
        //this.waitState = getWaitState();
        //this.taskStatus = TaskStatus.QUEUE_UP;
    }

    public void createTask(){
        System.out.println("taskRunner收到任务，更新任务状态为等待，添加进入等待队列");
        this.setState(waitState);
        this.taskStatus = TaskStatus.QUEUE_UP;
    }

    public void runTask(){
        if(state.runTask()){
            state.runSuccess();
        }else {
            state.runFail();
        }
    }

    public State getState() {
        return state;
    }

    public TaskRunner setState(State state) {
        this.state = state;
        return this;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public TaskRunner setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public State getWaitState() {
        return waitState;
    }

    public TaskRunner setWaitState(State waitState) {
        this.waitState = waitState;
        return this;
    }

    public State getRunState() {
        return runState;
    }

    public TaskRunner setRunState(State runState) {
        this.runState = runState;
        return this;
    }

    public State getRunSuccessState() {
        return runSuccessState;
    }

    public TaskRunner setRunSuccessState(State runSuccessState) {
        this.runSuccessState = runSuccessState;
        return this;
    }

    public State getRunFailState() {
        return runFailState;
    }

    public TaskRunner setRunFailState(State runFailState) {
        this.runFailState = runFailState;
        return this;
    }
}
