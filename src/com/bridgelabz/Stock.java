package com.bridgelabz;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        System.out.println("Stock Management ");
        Scanner sc = new Scanner(System.in);
        StockFunction stockFunction = new StockFunction();
        boolean isExit = false;

        while(!isExit) {
            System.out.println("\nEnter 1. Add Stock \nEnter 2. Print Report \nEnter 3. Exit !");

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
                    System.out.println("Exit !");
                    isExit = true;
                    break;

                default :
                    System.out.println("Enter the Proper choice");
            }
        }
    }
}