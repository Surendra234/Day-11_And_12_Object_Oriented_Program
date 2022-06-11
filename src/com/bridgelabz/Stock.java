package com.bridgelabz;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        System.out.println("Stock Management ");
        Scanner sc = new Scanner(System.in);

        // Creating the Object
        StockFunction stockFunction = new StockFunction();
        AccountTest accountTest = new AccountTest();

        boolean isExit = false;

        while(!isExit) {
            System.out.println("\nEnter 1. Add Stock \nEnter 2. Print Report \nEnter 3. Check Account balance " +
                    "\nEnter 4. Credit Amount \nEnter 5. Debit Amount  \nEnter 6. Exit !");

            int choice = sc.nextInt();
            switch(choice) {

                case 1:
                    stockFunction.addStock();
                    System.out.println("=============================================================================");
                    break;

                case 2:
                    stockFunction.printReport();
                    break;

                case 3:
                    accountTest.checkBalance();
                    break;

                case 4:
                    accountTest.creditBalance();
                    break;

                case 5:
                    accountTest.debitBalance();
                    break;

                case 6:
                    System.out.println("Exit !");
                    isExit = true;
                    break;

                default :
                    System.out.println("Enter the Proper choice");
            }
        }
    }
}