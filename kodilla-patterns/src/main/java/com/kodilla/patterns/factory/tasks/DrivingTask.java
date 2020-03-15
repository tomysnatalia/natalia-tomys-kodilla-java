package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    boolean isExecuted;

    public DrivingTask (String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
