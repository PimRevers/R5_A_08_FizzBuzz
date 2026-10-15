package com.controle.tdd;

public class FizzBuzz {
    /*
    On vérifie d'abord que le nombre est divisible par 3 et 5 puis on vérifie si le nombre est divisible par 3 ou par 5
    et on retourne le nombres pour les autres qui sont non divisible par 3 ou par 5
     */

    public static String de(int nbre) {

        if (nbre % 15 == 0) {
            return "FizzBuzz";
        }

        else if (nbre % 3 == 0) {
            return "Fizz";
        }

        else if (nbre % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(nbre);
    }
}
