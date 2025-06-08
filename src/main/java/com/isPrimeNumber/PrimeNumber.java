package com.isPrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

    /**
     * PRIME NUMBER - Divisible by 1 or self
     */

    public static void returnPrime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int digit = input.nextInt();
        if (isPrime(digit)) {
            System.out.println("prime number received");
        } else {
            System.out.println("not a prime number");
        }
    }

    /**
     * Optimization ->
     * If a number is undivided until it's square root, It will not be divided any further
     * e.g.-> 100 - can be divided by 10 (gives a surety that it isn't prime)
     * 13 -> its perfect root doesn't exist, nearest one is between 3-4
     * if we check it's divisibility until 4, we can ensure it will not be divided any further
     * hence avoiding checking until 13
     */

    public static boolean isPrime(int input) {
        int count = 0;
        if (input == 0 || input == 1) {
            return false;
        }
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                count++;
                break;
            }
        }
        return count == 0;
    }
}
