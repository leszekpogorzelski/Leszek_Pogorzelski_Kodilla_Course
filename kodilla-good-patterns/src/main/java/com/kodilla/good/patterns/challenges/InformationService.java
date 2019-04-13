package com.kodilla.good.patterns.challenges;

public interface InformationService {

   default void informUser(User user){
       OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
       OrderRequest orderRequest = orderRequestRetriver.retrive();

       System.out.println("Order accepted\n");
       System.out.println("Your order: " );
       for(int i = 0; i < orderRequest.getProducts().getProductsOrderd().size(); i++){
           System.out.println(orderRequest.getProducts().getProductsOrderd().get(i));
       }
       System.out.println("\nOrder taken on: " + orderRequest.getLocalDate().toString());
   }
}
