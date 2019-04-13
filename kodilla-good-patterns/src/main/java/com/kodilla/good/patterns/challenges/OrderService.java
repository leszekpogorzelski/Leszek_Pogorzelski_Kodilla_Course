package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

   default boolean orderPlaced(User user, Products products, LocalDate localDate) {
       return true;
   }
}
