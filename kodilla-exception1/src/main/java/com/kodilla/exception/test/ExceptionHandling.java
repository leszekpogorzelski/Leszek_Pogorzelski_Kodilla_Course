package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){
        double x = 2;
        double y = 1.5;
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x,y));
        }catch(Exception e){
            x=1;
            y=2;

    }finally {

            try {System.out.println(secondChallenge.probablyIWillThrowException(x,y));}
            catch (Exception e){
                System.out.println("Error!");
            }
        }
        }

}
