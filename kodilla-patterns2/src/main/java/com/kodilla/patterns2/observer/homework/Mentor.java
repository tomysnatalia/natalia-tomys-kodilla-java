package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        System.out.println( "Student: " + student.getNameAndSurname() + " sent a new task number: " + student.getTasks() + "\n" + "number of tasks to be checked by "  + mentorName + " -  " + student.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
