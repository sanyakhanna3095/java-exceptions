package com.bridgelabz.exceptionHandling;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor to initialize account balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to Withdraw Amount
    public void withdraw(double amnt) throws InsufficientBalanceException {
        if (amnt < 0) {
            // Throws exception for negative amount
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amnt > balance) {
            // Throws exception for insufficient funds
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        // Deducts amount from balance
        balance -= amnt;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    // Getter method to check account balance
    public double getBalance() {
        return balance;
    }
}


public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for initial balance
        System.out.print("Enter initial balance: ");
        double initial = sc.nextDouble();
        BankAccount account = new BankAccount(initial);

        try {
            // Take user input for withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amnt = sc.nextDouble();
            // Attempting withdrawal
            account.withdraw(amnt);
        } catch (InsufficientBalanceException e) {
            // Handling insufficient balance exception
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handling invalid amount exception
            System.out.println(e.getMessage());
        }
    }
}

/*
I/P-> Enter initial balance: 456700
Enter withdrawal amount: -6500
O/P-> Invalid amount!


I/P-> Enter initial balance: 32000
Enter withdrawal amount: 45000
O/P-> Insufficient balance!


I/P-> Enter initial balance: 15000
Enter withdrawal amount: 2500
O/P-> Withdrawal successful, new balance: 12500.0

 */