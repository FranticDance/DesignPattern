package com.my.pattern.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:16
 */
public class RunFailState extends State {


    @Override
    public void waitTask() {
        System.out.println("任务已经运行失败，请重新提交任务");
    }

    @Override
    public boolean runTask() {
        System.out.println("任务运行已经失败，不能继续运行");
        return false;
    }

    @Override
    public void runSuccess() {
        System.out.println("任务运行已经失败，请考虑重新提交任务");
    }

    @Override
    public void runFail() {
        System.out.println("任务运行已经失败，请考虑重新提交任务");
        taskRunner.setTaskStatus(TaskStatus.ERROR);
    }

    TaskRunner taskRunner;
    public RunFailState(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
}
