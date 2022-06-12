package com.bridgelabz;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        System.out.println("Stock Management ");
        Scanner sc = new Scanner(System.in);

        // Creating the Object
        StockFunction stockFunction = new StockFunction();

        boolean isExit = false;

        while(!isExit) {

            System.out.println("\nEnter 1. Buy Share\nEnter 2. Sell Share"+ "\nEnter 3. Credit Amount " +
                    "\nEnter 4. Debit Amount \nEnter 5. Account balance \nEnter 6. Print Report " +
                    "\nEnter 7. Create Stock \nEnter 8. Exit !");

            int choice = sc.nextInt();
            int amount;
            String symbol;

            switch(choice) {

                case 1:
                    System.out.println("Which stock you want to Buy :");
                    symbol = sc.next();
                    System.out.println("Enter the Amount for buy the share :");
                    amount = sc.nextInt();
                    stockFunction.buy(amount,symbol);
                    break;

                case 2:
                    System.out.println("Which stock you want to Sell :");
                    symbol = sc.next();
                    System.out.println("Enter the price to sell the share :");
                    amount = sc.nextInt();
                    stockFunction.sell(amount,symbol);
                    break;

                case 3:
                    System.out.println("Enter the Amount which you want to deposit : ");
                    amount = sc.nextInt();
                    AccountTest.creditBalance(amount);
                    break;

                case 4:
                    System.out.println("Enter the Amount you want to Withdraws : ");
                    amount = sc.nextInt();
                    AccountTest.debitBalance(amount);
                    break;

                case 5:
                    stockFunction.valueOf();
                    break;

                case 6:
                    stockFunction.printReport();
                    break;

                case 7:
                    System.out.println("Enter the name of stock ");
                    String name = sc.next();
                    stockFunction.createStock(name);
                    break;

                case 8:
                    System.out.println("Exit !");
                    isExit = true;
                    break;

                default :
                    System.out.println("Enter the Proper choice");
            }
        }
    }
}