package com.my.pattern.behavior.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:13
 */
public class WaitTaskState extends State{
    @Override
    public void waitTask() {
        System.out.println("任务正在等待执行");
        taskRunner.setTaskStatus(TaskStatus.QUEUE_UP);
    }

    @Override
    public boolean runTask() {
        System.out.println("任务正在等待执行，暂时不能运行,需要等待");
        return false;
    }

    @Override
    public void runSuccess() {
        System.out.println("任务正在等待执行，还未运行成功");
    }

    @Override
    public void runFail() {
        System.out.println("任务正在等待执行，尚未运行失败");
    }

    TaskRunner taskRunner;
    public WaitTaskState(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
}
