package com.my.pattern.state;

/**
 * @author lee
 * @version 1.0
 * @date 2020/10/28 14:15
 */
public class Client {
    public static void main(String[] args) {
       for (int i = 0; i < 10; i++) {
            System.out.println("*********************");
            TaskRunner taskRunner = new TaskRunner();
            taskRunner.createTask();
            taskRunner.setState(taskRunner.getRunState());
            taskRunner.runTask();
        }
    }
}
