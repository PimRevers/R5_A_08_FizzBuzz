/*
FizzBuzz.de(1) -> "1"
FizzBuzz.de(3) -> "Fizz"
FizzBuzz.de(5) -> "Buzz"
FizzBuzz.de(9) -> "Fizz"
FizzBuzz.de(10) -> "Buzz"
FizzBuzz.de(15) -> "FizzBuzz"
 */

/*
J'ai choisi cette liste-là car elle commence par le premier chiffre (1) puis on prend le premier chiffre qui donne Fizz donc le premier chiffre divisible par 3 (3)
puis celui qui donne Buzz donc divisible par 5 (5) puis on prend un autre nombre pour lequel on peut diviser plusieurs fois par 3 (9) et un autre pour 5 (10)
et pour finir, on prend un nombre divisible par 3 et 5 pour avoir FizzBuzz (15).
 */

package com.controle.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void fizzBuzz_de_1_devrait_retourner_1() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(1);

        // THEN
        assertThat(resultat).isEqualTo("1");
    }

    @Test
    void fizzBuzz_de_3_devrait_retourner_fizz() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(3);

        // THEN
        assertThat(resultat).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz_de_5_devrait_retourner_buzz() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(5);

        // THEN
        assertThat(resultat).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz_de_9_devrait_retourner_fizz() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(9);

        // THEN
        assertThat(resultat).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz_de_10_devrait_retourner_buzz() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(10);

        // THEN
        assertThat(resultat).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz_de_15_devrait_retourner_fizz_buzz() {
        // GIVEN / WHEN
        String resultat = FizzBuzz.de(15);

        // THEN
        assertThat(resultat).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest(name = "Pour nbre = {0}, attendu = {1}")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "6, Fizz",
            "7, 7",
            "8, 8",
            "9, Fizz",
            "10, Buzz",
            "11, 11",
            "12, Fizz",
            "13, 13",
            "14, 14",
            "15, FizzBuzz",
            "16, 16",
            "17, 17",
            "18, Fizz",
            "19, 19",
            "20, Buzz"
    })
    void test_parametre_sur_20_valeurs(int nbre, String attendu) {
        // WHEN
        String resultat = FizzBuzz.de(nbre);

        // THEN
        assertThat(resultat).isEqualTo(attendu);
    }
}
