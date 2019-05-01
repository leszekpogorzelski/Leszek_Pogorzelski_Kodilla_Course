package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
   private ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
   public OddNumbersExterminator(){

        }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){


        if (numbers.size() == 0){
            System.out.println("Tablica jest pusta!");
        }
        else {
            for (int i = 0; i < numbers.size(); i++)
                if ((numbers.get(i) % 2 == 0) && (numbers.get(i) != 0)) {
                    oddNumbers.add(numbers.get(i));
                }
        }
        return oddNumbers;
        }
        public int getOddNumbersSize(){
       return oddNumbers.size();
        }

    public Integer getOddNumbers(int x) {
           return oddNumbers.get(x);
    }
}

