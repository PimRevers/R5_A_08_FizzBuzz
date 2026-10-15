package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre) {

        if (nbre % 3 != 0 && nbre % 5 != 0) {
            return String.valueOf(nbre);
        }
        return "";
    }
}
