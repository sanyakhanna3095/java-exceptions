package com.bridgelabz.exceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking two integer inputs from the user
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            // Performing division
            int res = num / den;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}


/*
I/P-> Enter numerator: 4
Enter denominator: y

O/P->
Invalid input! Please enter valid integers.
Operation completed.
 */