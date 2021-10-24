package com.blp.logicalprograms;

import java.util.Scanner;

/**
 * Reverse a Given Number
 */
public class ReverseANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Use scanner to read number
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Reverse number is = " + reverse(number) + " ");
    }

    private static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = ((rev * 10) + number % 10);
            number = number / 10;
        }
        return (rev);
    }
}
