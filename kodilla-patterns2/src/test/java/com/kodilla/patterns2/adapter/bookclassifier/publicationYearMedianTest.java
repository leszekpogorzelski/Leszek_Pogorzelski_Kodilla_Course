package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.SalaryAdapter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class publicationYearMedianTest {

    @Test
    public void libraryAMedianTest() {
        //Given
        Book book1 = new Book("XYZZ ZYZZ","Title1", 2000, "ABK 1289721" );
        Book book2 = new Book("XYZXX ZYZZZ","Title2", 2001, "ABK 1283721" );
        Book book3 = new Book("XYZXXX ZYZZZZ","Title3", 2018, "ABK 1285721" );
        Book book4 = new Book("XYZXXXX ZYZZZZ","Title4", 2005, "ABK 1286721" );
        Book book5 = new Book("XYZXXXXZZ ZYZZZZZZ","Title5", 2015, "ABK 1286721" );
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter adapter = new MedianAdapter();
        //When

        int median = adapter.publicationYearMedian(books);
        System.out.println(median);
        //Then
        Assert.assertEquals(median, 2005);
    }
}
