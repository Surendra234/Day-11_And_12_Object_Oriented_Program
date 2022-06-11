package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockList {

    private static double totalValueOfStocks;
    // Creating an ArrayList
    private static List<StockPortfolio> stockPortfolioList = new ArrayList<>();


    public static List<StockPortfolio> getStockPortfolioList() {
        return stockPortfolioList;
    }

    public static void setStockPortfolioList(List<StockPortfolio> stockPortfolioList) {
        StockList.stockPortfolioList = stockPortfolioList;
    }

    public static double getTotalValueOfStocks() {
        return totalValueOfStocks;
    }

    public static void setTotalValueOfStocks(double totalValueOfStocks) {
        StockList.totalValueOfStocks = totalValueOfStocks;
    }
}
