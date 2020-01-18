package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {

    private final int numberOfUser;
    private final String username;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postsNumber;

    public ForumUser (int numberOfUser, String username, char sex, LocalDate birthdayDate, int postsNumber) {
        this.numberOfUser = numberOfUser;
        this.username = username;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsNumber = postsNumber;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "numberOfUser=" + numberOfUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
