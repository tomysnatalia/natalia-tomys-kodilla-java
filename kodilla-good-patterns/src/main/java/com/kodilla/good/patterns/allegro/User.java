package com.kodilla.good.patterns.allegro;

public class User {

    private String userName;
    private String realName;
    private String surname;

    public User(String userName, String realName, String surname) {
        this.userName = userName;
        this.realName = realName;
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getSurname() {
        return surname;
    }
}
