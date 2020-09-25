package com.bank.application;

//class for Bank system
public class Bank {
    private double totalAssetsBalance; //Bank assets balance

    //constructor for initializing bank instance
    Bank(){
        this.totalAssetsBalance =0.0;
    }
    //getter for totalAssetsBalance
    public double getTotalAssets() {
        return totalAssetsBalance;
    }
    //setter for totalAssetsBalance
    public void setTotalAssetsBalance(double totalAssetsBalance) {
        this.totalAssetsBalance += totalAssetsBalance;
    }

}
