package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Home Library");

        Book book1 = new Book("Ksiega Dżungli", "Rudyard Kipling", LocalDate.of(2001, Month.MARCH, 20));
        Book book2 = new Book("50 Twarzy Greya", "E.L. James", LocalDate.of(2011, Month.DECEMBER, 06));
        Book book3 = new Book("Pan Tadeusz", "Adam Mickiwiecz", LocalDate.of(1999, Month.SEPTEMBER, 10));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Home Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            clonedLibrary.setName("Home Library - deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);

        }
        //When
        library.removeBook(book3);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

    }
}
