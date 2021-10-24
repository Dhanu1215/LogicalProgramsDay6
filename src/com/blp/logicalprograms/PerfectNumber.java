package com.blp.logicalprograms;

import java.util.Scanner;

/**
 * Perfect Number
 */
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Use scanner to read number
        System.out.println("Enter Number");
        int number = sc.nextInt();
        check(number);//Call method to check number is perfect or not
    }

    private static void check(int number) {
        int sum = 0; // Declare and initialize variable
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i +" "+"+"+" ");
                sum = sum + i;
            }
        }
        System.out.println("="+" "+sum);
        if (sum == number) { //Check number is perfect number or not
            System.out.println("Number is Perfect Number");
        } else
            System.out.println("Number is not Perfect Number");
    }
}
