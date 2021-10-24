package com.blp.logicalprograms;

import java.util.Scanner;

/**
 * Check Number is Prime Or Not
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Use scanner to read number
        System.out.println("Enter Number");
        int number = sc.nextInt();
        check(number);
    }

    private static void check(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Number is not a prime number");
                break;
            } else {
                System.out.println("Number is a prime number");
            }
        }
    }
}
