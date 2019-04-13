package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {

   default boolean createOrder(User user, Products products, LocalDate localDate) {
       return true;
   }
}
