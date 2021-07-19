package com.company;

public class Task {
    private String taskName;
    private boolean taskBooleanStatus;
    private int taskId;

    public Task(String taskName, boolean taskBooleanStatus, int taskId) {
        this.taskName = taskName;
        this.taskBooleanStatus = taskBooleanStatus;
        this.taskId = taskId;
    }

    public void setTaskBooleanStatus(boolean taskBooleanStatus) {
        this.taskBooleanStatus = taskBooleanStatus;
    }

    public boolean isTaskBooleanStatus() {
        return taskBooleanStatus;
    }

    @Override
    public String toString() {
        return taskId + "." + taskName;
    }
}
