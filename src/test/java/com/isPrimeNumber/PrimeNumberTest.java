package com.isPrimeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.isPrimeNumber.PrimeNumber.isPrime;

public class PrimeNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 17})
    void test_prime_number(int inputs) {
        var prime = isPrime(inputs);
        Assertions.assertTrue(prime);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, 10, 100})
    void test_non_prime_number(int inputs) {
        var prime = isPrime(inputs);
        Assertions.assertFalse(prime);

    }

}
