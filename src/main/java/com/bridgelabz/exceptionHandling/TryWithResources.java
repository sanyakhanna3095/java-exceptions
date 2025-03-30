package com.bridgelabz.exceptionHandling;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        // File to read from
        String fileName = "/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-Exceptions/src/main/java/com/bridgelabz/exceptionHandling/info.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read the first line from the file
            String firstLine = br.readLine();

            // Print the first line if file is not empty
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            }
            else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            // Handle any IO exceptions, including file not found
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


/*
I/P-> info.txt
O/P -> Error reading file: info.txt (No such file or directory)

I/P->/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-Exceptions/src/main/java/com/bridgelabz/exceptionHandling/info.txt
As the file is not empty O/P-> First line: A sample input file is used to ensure an XML map is performing the mapping properly.
 */