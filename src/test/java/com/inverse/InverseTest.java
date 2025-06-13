package com.inverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.inverse.Inverse.inverse;

public class InverseTest {

    @Test
    void test_prime_number() {
        var inverse = inverse(81456273);
        Assertions.assertEquals(87654321, inverse);
    }
}
