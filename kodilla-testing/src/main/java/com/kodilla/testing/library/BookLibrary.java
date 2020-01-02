package com.kodilla.testing.library;
import java.util.ArrayList;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public ArrayList<Book> listBooksWithCondition(String titleFragment) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);

        return bookList;
    }

}
