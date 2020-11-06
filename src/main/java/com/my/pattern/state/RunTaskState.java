package com.my.pattern.state;

import java.util.Random;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 10:15
 */
public class RunTaskState extends State {
    @Override
    public void waitTask() {
        System.out.println("任务正在执行，不能重新等待");
    }

    @Override
    public boolean runTask() {
        System.out.println("任务正在执行");
        taskRunner.setTaskStatus(TaskStatus.RUNNING);
        Random r = new Random();
        int num = r.nextInt(10);
        // 假设40%任务成功执行
        if(num == 0 || num == 3 || num == 6 || num == 9){
            // 改变活动状态
            taskRunner.setTaskStatus(TaskStatus.SUCCESS);
            taskRunner.setState(taskRunner.getRunSuccessState());
            return true;
        }else{
            taskRunner.setTaskStatus(TaskStatus.ERROR);
            taskRunner.setState(taskRunner.getRunFailState());
            System.out.println("很遗憾任务执行失败！");
            return false;
            // 改变状态
        }
    }

    @Override
    public void runSuccess() {
        System.out.println("任务正在执行，尚未运行成功");
    }

    @Override
    public void runFail() {
        System.out.println("任务正在执行，尚未运行失败");
    }

    TaskRunner taskRunner;
    public RunTaskState(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
}
