package com.bridgelabz.exceptionHandling;

import java.util.Scanner;

public class ExceptionPropagation {

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        // Simple interest formula
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Take user input for amount, rate, and years
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter number of years: ");
            int years = sc.nextInt();

            // Calculate interest
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
    }
}


/*
I/P -> Enter principal amount: one thousand rupees
O/P-> Invalid input! Please enter numeric values.



I/P -> Enter principal amount: 5000
Enter interest rate: 2
Enter number of years: 5

O/P->
Calculated Interest: 500.0

 */