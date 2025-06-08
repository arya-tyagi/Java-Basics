package com;

import com.isPrimeNumber.PrimeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var input = new Scanner(System.in);
        System.out.println("Select an operation");
        System.out.println("Check for Prime Number - 1");
        System.out.println("Exit - 0");

        int operation = input.nextInt();

        switch(operation){
            case 1:
                PrimeNumber.returnPrime();
                break;
            default:
                System.out.println("exiting");
                break;
        }

    }
}
