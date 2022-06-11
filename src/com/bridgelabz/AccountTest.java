package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    static double accountBalance = 0;
    Scanner sc = new Scanner(System.in);

    // Method to check balance
    public void checkBalance() {

        System.out.println("Account balance : " +accountBalance);
    }

    // Method to credit amount
    public void creditBalance() {

        System.out.println("Enter the Amount which you want to deposit in your Account :");
        long testCredit = sc.nextLong();
        accountBalance = accountBalance + testCredit;

        System.out.println(testCredit +" Credit successfully" +" Account balance : " +accountBalance);
    }

    // Method to debit balance
    public void debitBalance() {

        System.out.println("Enter the amount how much you want to Withdraws : ");
        double debitAmount = sc.nextDouble();

        if(debitAmount <= accountBalance) {
            double testDebit = accountBalance - debitAmount;
            System.out.println(debitAmount + " Debit successfully " +"Account balance : " +testDebit);
        }
        else
            System.out.println("Account Balance is low");
    }
}
