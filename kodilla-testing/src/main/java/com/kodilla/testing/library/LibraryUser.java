package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firstname, String lastame, String peselId ) {
        this.firstname = firstname;
        this.lastname = lastame;
        this.peselId = peselId;
    }

    public String getFirstname() { return firstname; }

    public String getPeselId() {
        return peselId;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, peselId);
    }
}
