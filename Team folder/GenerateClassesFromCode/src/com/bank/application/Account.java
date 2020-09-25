package com.bank.application;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

//Account class
public class Account {
    protected double accBalance; //Balance of account holder
    protected String accountId; //Account holder id
    protected boolean isShared,isPrivate;// account type
    private final Bank bank;
    private Set<Customer> customers = new LinkedHashSet<>(); //for storing customers associated with account

    //constructor for initializing Account
    Account(Bank bank,String accountId) {
        this.bank = bank;
        this.accountId = accountId;
        this.accBalance = 0;
        this.isShared = false;
        this.isPrivate = true;

    }
    //getter and setter for accountId field
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    //getter and setter for isShared field
    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }


    //getter and setter for isPrivate field
    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    //getter for accBalance
    public double getBalance() {
        return accBalance;
    }
    //setter for accBalance
    public void setBalance(double balance) {
        this.accBalance = balance;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    //helper function to generate account number
    private String generateAccountNumber(){
        return String.valueOf(10000000 + new Random().nextInt(99999999));
    }

    public void convertSharedAccountToPrivate(double sharedRatio){
        Set<Customer> customers = this.getCustomers(); //get all customer detail associated with account
        double balanceInAccount= this.accBalance; // get current balance in account
        for (Customer customer:customers) {
            Account account = new Account(this.bank,generateAccountNumber()); // create new account with new account number
            customer.setAccount(account); // set account to existing customer
            double accountBalanceToTransfer = balanceInAccount*sharedRatio;
            this.makeTransferTo(account,accountBalanceToTransfer); //make transfer based on shared proportion
        }

    }

    //Adding and removing customer
    public Set<Customer> addCustomer(Customer customer){
        customers.add(customer);
        return customers;
    }
    public Set<Customer> removeCustomer(Customer customer){
        customers.remove(customer);
        return customers;
    }


    //Depositing amount into bank by account holder
    public  void deposit(double amount){
        if (amount >= 0) {
            accBalance += amount;
            bank.setTotalAssetsBalance(accBalance);
        }
        else {
            System.out.println("Please check amount and try again!!");
        }
    }
    //make transfer from one account to another
    public void makeTransferTo(Account account,double withAmount){
        if(this.accBalance >0){
            this.accBalance -= withAmount;
            account.accBalance += withAmount;
        }
        else {
            System.out.println("Insufficient balance for transfer!!");
        }
    }



}

