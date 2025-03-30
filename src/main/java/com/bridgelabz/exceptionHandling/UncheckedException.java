package com.bridgelabz.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter numerator: ");
            int x = sc.nextInt();

            System.out.print("Enter denominator: ");
            int y = sc.nextInt();

            // Perform division
            int res = x / y;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handle invalid input
            System.out.println("Error: Enter numeric values only.");
        } finally {
            System.out.println("Code finished!");
        }
    }
}


/*
I/P->
Enter numerator: 5
Enter denominator: 0

O/P->
Error: Division by zero is not allowed.
Code finished!

 */