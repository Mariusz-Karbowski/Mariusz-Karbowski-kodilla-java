package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book bookNo1 = new Book("BookNo1", "AuthorNo1", LocalDate.of(2001, 1, 1));
        Book bookNo2 = new Book("BookNo2", "AuthorNo2", LocalDate.of(2002, 2, 2));
        Book bookNo3 = new Book("BookNo3", "AuthorNo3", LocalDate.of(2003, 3, 3));
        Library library = new Library("Library One");
        library.getBooks().add(bookNo1);
        library.getBooks().add(bookNo2);
        library.getBooks().add(bookNo3);

        Library shallowCopyLibrary = null;
        Library deepCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Library ShallowCopy");
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library DeepCopy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        library.getBooks().remove(bookNo3);
        library.getBooks().remove(bookNo2);
        //Then
        System.out.println(library.getName() + ": " + library.getBooks());
        System.out.println(shallowCopyLibrary.getName() + ": " + shallowCopyLibrary.getBooks());
        System.out.println(deepCopyLibrary.getName() + ": " + deepCopyLibrary.getBooks());
        assertEquals(1, library.getBooks().size());
        assertEquals(1, shallowCopyLibrary.getBooks().size());
        assertEquals(3,deepCopyLibrary.getBooks().size());

    }
}
