package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        String error = new String();

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
    } catch (ArithmeticException a) {
            error = "Wykryto próbę dzielenia przez zero!";
        } finally {
            System.out.println(error + "\nCzy chcesz wyjkonać kolejne działanie?");
        }
        }
}
