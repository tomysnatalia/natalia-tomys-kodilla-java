package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task  {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted;

    public PaintingTask (String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
