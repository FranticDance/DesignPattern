package com.my.pattern.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:16
 */
public class RunSuccessState extends State {
    @Override
    public void waitTask() {
        System.out.println("任务运行已经成功，不能重新等待");
    }

    @Override
    public boolean runTask() {
        System.out.println("任务已经运行成功,是否重新运行");
        return false;
    }

    @Override
    public void runSuccess() {
        System.out.println("任务运行成功了");
        taskRunner.setTaskStatus(TaskStatus.SUCCESS);
    }

    @Override
    public void runFail() {
        System.out.println("任务运行成功，并没有失败");
    }
    TaskRunner taskRunner;
    public RunSuccessState(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
}
