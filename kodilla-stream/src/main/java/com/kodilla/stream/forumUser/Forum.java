package com.kodilla.stream.forumUser;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Natalia", 'F', LocalDate.of(1989, Month.MARCH,14), 4));
        theUserList.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1991, Month.APRIL,30), 12));
        theUserList.add(new ForumUser(1, "Quattro", 'M', LocalDate.of(2019, Month.OCTOBER,21), 0));
        theUserList.add(new ForumUser(1, "Elka", 'F', LocalDate.of(1958, Month.NOVEMBER,11), 8));
        theUserList.add(new ForumUser(1, "Krzyś", 'M', LocalDate.of(2006, Month.FEBRUARY,8), 21));
        theUserList.add(new ForumUser(1, "Hugo", 'M', LocalDate.of(2018, Month.SEPTEMBER,10), 0));
        theUserList.add(new ForumUser(1, "Marysia", 'F', LocalDate.of(2001, Month.JULY,25), 6));
        theUserList.add(new ForumUser(1, "Szymon", 'M', LocalDate.of(1979, Month.MARCH,25), 4));

    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }
}
