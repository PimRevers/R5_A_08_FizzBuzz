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

public class FizzBuzzTest {
    @Test
    void fizzBuzz_de_1_devrait_retourner_1() {
        Assertions.fail("echec cycle 1");
    }
}
