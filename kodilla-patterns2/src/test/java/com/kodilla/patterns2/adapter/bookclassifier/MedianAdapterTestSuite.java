package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "001"));
        bookA.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "002"));
        bookA.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "003"));
        bookA.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "004"));
        bookA.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "005"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        assertEquals(2007, median);


    }
}
