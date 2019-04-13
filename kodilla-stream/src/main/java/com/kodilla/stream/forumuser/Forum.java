package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<ForumUser> theList = new ArrayList<>();

    public Forum() {
        theList.add(new ForumUser(1, "Jan Kowlaki", 'M',50, LocalDate.of(1989, 01, 12) ));
        theList.add(new ForumUser(2, "Jacek Nowak", 'M', 0,LocalDate.of(1974, 11, 11) ));
        theList.add(new ForumUser(3, "Katarzyna Jablonska", 'F',1, LocalDate.of(1999,10,21)));
        theList.add(new ForumUser(4, "Anna Cicha", 'F', 100, LocalDate.of(2001,1,1) ));
        theList.add(new ForumUser(5, "Janina Supeł", 'F',500,  LocalDate.of(1998,3,13)));
        theList.add(new ForumUser(6, "Marta Nawrocka", 'F',2,  LocalDate.of(1982,11,16)));
        theList.add(new ForumUser(7, "Paweł Kownacki", 'M',3,  LocalDate.of(1989,9,5)));
        theList.add(new ForumUser(8, "Tomasz Kalinowski", 'M',15, LocalDate.of(1984, 7,7)));
        theList.add(new ForumUser(9, "Maciej Panek", 'M', 8, LocalDate.of(1999,12,7) ));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(theList);

    }
}
