package com.bridgelabz.exceptionHandling;

public class ExceptionPropagationMethods {

    // Method that throws an ArithmeticException
    static void method1() {
        // This will cause ArithmeticException
        int result = 10 / 0;
    }

    // Method that calls method1()
    static void method2() {
        // Exception propagates to this method
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
            // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
