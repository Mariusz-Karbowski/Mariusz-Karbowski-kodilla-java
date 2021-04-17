package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("AuthorNo1", "TitleNo1", 2011, "1111"));
        bookSet.add(new Book("AuthorNo2", "TitleNo2", 2012, "2222"));
        bookSet.add(new Book("AuthorNo3", "TitleNo3", 2013, "3333"));
        bookSet.add(new Book("AuthorNo4", "TitleNo4", 2014, "4444"));
        bookSet.add(new Book("AuthorNo5", "TitleNo5", 2015, "5555"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2013, median);
    }
}
