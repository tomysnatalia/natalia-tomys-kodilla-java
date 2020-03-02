package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    private TaskList tasks;

    public Board (TaskList toDoList, TaskList inProgressList, TaskList doneList, TaskList tasks) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
        this.tasks = tasks;
    }
    public Board () {

    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getTasks() {
        return tasks;
    }
}
