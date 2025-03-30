package com.bridgelabz.exceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            // Taking index input
            System.out.print("Enter array index: ");
            int idx = sc.nextInt();

            try {
                // Access array element
                int value = arr[idx];

                // Taking divisor input
                System.out.print("Enter divisor: ");
                int div = sc.nextInt();

                try {
                    // Performing division
                    int res = value / div;
                    System.out.println("Result: " + res);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}


/*
I/P->
Enter the size of the array: 5
Enter 5 elements:
1 2 3 4 5
Enter array index: 5

O/P->
Invalid array index!
 */