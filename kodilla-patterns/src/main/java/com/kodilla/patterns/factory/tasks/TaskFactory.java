package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DrivingTask = "Driving task";
    public static final String PaintingTask = "Painting task";
    public static final String ShoppingTask = "Shopping task";

    public final Task makesTask (final String taskClass) {
        switch (taskClass) {
            case DrivingTask:
                return new DrivingTask( "Driving task", "to Spain", "your own car" );
            case PaintingTask:
                return new PaintingTask ("Painting task", "black", "garden table");
            case ShoppingTask:
                return new ShoppingTask("Shopping task", "still water", 6);
            default:
                return null;
        }
    }
}
