package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {





    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> filteredMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getAge() > 20)
                .filter(forumUser -> forumUser.getPostCount() > 0 )
                .collect(Collectors.toMap(ForumUser::getUserdId, forumUser -> forumUser));

        System.out.println("# elements: " + filteredMap.size());
        filteredMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));

        //System.out.println(theResultStringOfBooks);

    }
}