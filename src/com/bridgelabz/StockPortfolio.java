package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

    private String stockName;
    private int numOfShare;
    private double sharePrice;
    private double totalValueOfShare;

    // Getter and Setter Method
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int numOfShare) {
        this.numOfShare = numOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalValueOfShare() {
        return totalValueOfShare;
    }

    public void setTotalValueOfShare(double totalValueOfShare) {
        this.totalValueOfShare = totalValueOfShare;
    }


    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stockName='" + stockName + '\'' +
                ", numOfShare=" + numOfShare +
                ", sharePrice=" + sharePrice +
                ", totalValueOfShare=" + totalValueOfShare +
                '}';
    }
}
