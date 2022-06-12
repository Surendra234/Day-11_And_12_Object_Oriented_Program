package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class StockFunction implements StockAccount {

    Scanner sc = new Scanner(System.in);

    // Find Stock
    public StockPortfolio findStock(String name) {

        List<StockPortfolio> shareList = StockList.getStockPortfolioList();
        for(StockPortfolio count : shareList) {
            if(count.getStockName().equals(name))
                return count;
        }
        return null;
    }

    // Add Stock
    public StockPortfolio createStock(String name) {

        List<StockPortfolio> shareList = StockList.getStockPortfolioList();

        System.out.println("Enter the price of the share : ");
        double sharePrice = sc.nextLong();

        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStockName(name);
        stockPortfolio.setNumOfShare(2);
        stockPortfolio.setSharePrice(sharePrice);

        stockPortfolio.setTotalValueOfShare(stockPortfolio.getNumOfShare()* stockPortfolio.getSharePrice());

        shareList.add(stockPortfolio);
        StockList.setStockPortfolioList(shareList);

        return stockPortfolio;
    }

    @Override
    public double valueOf() {
        System.out.println("Account balance : " +AccountTest.getAccountBalance());
        return AccountTest.getAccountBalance();
    }

    @Override
    public void buy(int amount, String symbol) {
            if(amount > AccountTest.getAccountBalance()) {
                System.out.println("You Don't have the Enough balance");
                return;
            }

            StockPortfolio find = findStock(symbol);
            if(find == null) {
                find = createStock(symbol);
            }

            int numOfShare = (int) (amount/find.getSharePrice());
            double testDebit = numOfShare * find.getSharePrice();
            AccountTest.debitBalance(testDebit);
            find.setNumOfShare(numOfShare + find.getNumOfShare());
            find.setTotalValueOfShare(find.getNumOfShare() * find.getSharePrice());
    }

    @Override
    public void sell(int amount, String symbol) {

        StockPortfolio find = findStock(symbol);

        if(find == null) {
            System.out.println("You don't have this Stock ");
            return;
        }

        int numOfShare = (int) (amount/find.getSharePrice());

        if(numOfShare > find.getNumOfShare()) {
            numOfShare = find.getNumOfShare();
        }
        find.setSharePrice(find.getNumOfShare() - numOfShare);
        double stockValue = find.getNumOfShare() * find.getSharePrice();
        find.setTotalValueOfShare(stockValue);

        double testCredit = find.getSharePrice() * numOfShare;
        AccountTest.creditBalance(testCredit);
    }

    public void printReport() {

        List<StockPortfolio> shareList = StockList.getStockPortfolioList();
        int value = 0;

        System.out.println("Report : ");

        for (StockPortfolio count : shareList) {
            value += count.getTotalValueOfShare();
            System.out.println("Stock : " +count);
        }
        System.out.println("\nTotal Value of Each Stock : " +value);
    }
}