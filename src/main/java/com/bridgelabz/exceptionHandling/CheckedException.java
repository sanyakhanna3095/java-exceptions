package com.bridgelabz.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        // File to be read
        String fileName = "input.txt";

        try {
            // Attempt to read the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                // Print file contents
                System.out.println(line);
            }
            // Close the file
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle exception if file not found
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            // Handle other IO exceptions
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


/*
O/P->
File not found: input.txt
 */