package com.blp.logicalprograms;

import java.util.Scanner;

/**
 * Print Fibonacci Series
 */
public class LogicalPrograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Use scanner to read number
        System.out.println("Enter number");
        int number = sc.nextInt();
        printSeries(number);//Call method to print fibonacci series
    }

    private static void printSeries(int number) {
        int num1 = 0; //Declaring and initializing variables
        int num2 = 1;
        int sum;
        System.out.print("Fibonacci Series = " + num1 + "  " + num2 + " ");
        for (int i = 0; i <= number; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(" " + sum + " ");
        }
    }
}
