package com.bridgelabz.exceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take user input for number of elements in the array
            System.out.print("Enter the number of elements to enter: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Accept array elements from user input
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Take user input for an index to get the corresponding value
            System.out.print("Enter index: ");
            int idx = sc.nextInt();

            // Print the value at the specified index
            System.out.println("Value at index " + idx + ": " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case where the index is out of bounds
            System.out.println("Invalid index! Enter a valid index range.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

/*
I/P ->
Enter the number of elements to enter: 5
Enter 5 elements:
1 2 3 4 5
Enter index: 6

O/P->
Invalid index! Enter a valid index range.
 */