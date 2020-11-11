package com.my.pattern.behavior.state;

/**
 * 任务状态
 * @author lee
 * @version 1.0
 * @date 2020/7/13 11:34
 */
public enum TaskStatus {
    /**
     * INIT
     */
    INIT(1, "INIT", "任务初始化"),
    /**
     * RUNNING
     */
    RUNNING(2, "RUNNING", "任务执行中"),
    /**
     * SUCCESS
     */
    SUCCESS(3, "SUCCESS", "任务执行成功"),
    /**
     * QUEUE_UP
     */
    QUEUE_UP(4, "QUEUE_UP", "任务正在排队"),
    /**
     * STOPPED
     */
    STOPPED(5, "STOPPED", "任务已停止"),
    /**
     * ERROR
     */
    ERROR(900, "ERROR", "任务执行出错"),
    ;

    int type;
    String name;
    String description;
    String reason;
    TaskStatus(int type, String name, String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }

    TaskStatus() {
    }

    public static TaskStatus getByType(int type){
        for (TaskStatus value : TaskStatus.values()) {
            if(type == value.getType()){
                return value;
            }
        }
        return null;
    }
    public String getReason() {
        return reason;
    }

    public TaskStatus setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public int getType() {
        return type;
    }

    public TaskStatus setType(int type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public TaskStatus setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus setDescription(String description) {
        this.description = description;
        return this;
    }

    public static void main(String[] args) {
        String name = TaskStatus.SUCCESS.getName();
        System.out.println(name);
    }

}
