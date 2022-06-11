package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class StockFunction {

    // Add Stock
    public void addStock() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Stock you want to add :");

        // Variable
        int choice = sc.nextInt();
        double valueOfShare = 0;
        double totalValueOfStock = 0;

        List<StockPortfolio> shareList = StockList.getStockPortfolioList();
        for(int i = 0; i < choice; i++) {

            StockPortfolio obj = new StockPortfolio();

            System.out.println("\nEnter the Name of Stock " +(i+1)+" : ");
            obj.setStockName(sc.next());
            System.out.println("Enter the Numbers of Share : ");
            obj.setNumOfShare(sc.nextInt());
            System.out.println("Enter the Price of Share : ");
            obj.setSharePrice(sc.nextDouble());

            valueOfShare = obj.getNumOfShare() * obj.getSharePrice();
            obj.setTotalValueOfShare(valueOfShare);
            shareList.add(obj);
            StockList.setStockPortfolioList(shareList);

            totalValueOfStock += valueOfShare;
            System.out.println("\nStock " +(i+1) +" added successfully ");
        }
        StockList.setTotalValueOfStocks(totalValueOfStock);
    }

    public void printReport() {

        List<StockPortfolio> shareList = StockList.getStockPortfolioList();
        System.out.println("\nStock Report  : \n");
        System.out.println("=============================================================================");
        for (StockPortfolio count : shareList) {
            System.out.println("Stock : " +count);
        }
        System.out.println("\nTotal Value of Each Stock : " +StockList.getTotalValueOfStocks());
        System.out.println("=============================================================================");
    }
}