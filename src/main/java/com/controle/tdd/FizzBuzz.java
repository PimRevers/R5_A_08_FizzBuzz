package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre) {


        if (nbre % 3 == 0) {
            return "Fizz";
        }

        if (nbre % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(nbre);
    }
}
