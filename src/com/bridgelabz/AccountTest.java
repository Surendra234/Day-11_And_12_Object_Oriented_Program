package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    private static double accountBalance = 0;
    static Scanner sc = new Scanner(System.in);


    // Method to credit amount
    public static void creditBalance(double amount) {


        accountBalance += amount;

        System.out.println(amount +" Credit successfully" +" Account balance : " +accountBalance);
    }

    // Method to debit balance
    public static void debitBalance(double amount) {

        if(amount <= accountBalance) {
            double testDebit = accountBalance - amount;
            System.out.println(amount + " Debit successfully " +"Account balance : " +testDebit);
        }
        else
            System.out.println("Account Balance is low");
    }

    // Getter and Setter Method
    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        AccountTest.accountBalance = accountBalance;
    }
}
