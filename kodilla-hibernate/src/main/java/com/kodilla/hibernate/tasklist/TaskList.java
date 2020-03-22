package com.kodilla.hibernate.tasklist;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TASKSLIST")
public class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
