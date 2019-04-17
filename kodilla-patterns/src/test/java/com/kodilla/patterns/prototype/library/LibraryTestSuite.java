package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks1() {
        //Given
        Library library = new Library("Libarary 1");

        //When
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.now())) );

        System.out.println(library.getName());
        System.out.println(library.getBooks());
        int librarySize = library.getBooks().size();

        //Then
        Assert.assertEquals(10, librarySize);
    }

    @Test
    public void testGetBooks2() {
        //Given
        Library library = new Library("Libarary 1");

        //When
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.now())) );

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2 - shallow copy" );
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());
        library.getBooks().clear();
        int librarySize = library.getBooks().size();
        int clonedLibrarySize = clonedLibrary.getBooks().size();

        //Then
        Assert.assertEquals(0, librarySize);
        Assert.assertEquals(0, clonedLibrarySize);
    }

    @Test
    public void testGetBooks3() {
        //Given
        Library library = new Library("Libarary 3 - deep copy");

        //When
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.now())) );

        //making a deep clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.deepCopy();
            clonedLibrary.setName("Library 3 - deep copy" );
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().clear();
        int librarySize = library.getBooks().size();
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());
        int clonedLibrarySize = clonedLibrary.getBooks().size();

        //Then
        Assert.assertEquals(0, librarySize);
        Assert.assertEquals(10, clonedLibrarySize);
    }
}
