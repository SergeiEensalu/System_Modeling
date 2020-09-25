package com.bank.application;

import java.util.Set;

//Customer class who makes account in bank
public class Customer{
    private String customerName; //customer name
    private Account account; // customer account

    //constructor to initialize customer object
    public Customer(String customerName) {
        this.customerName = customerName;
    }
    //getter for customerName
    public String getCustomerName() {
        return customerName;
    }
    //setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    //setter for account
    public void setAccount(Account account) {
        this.account = account;
        Set<Customer> accountInfo = account.addCustomer(this);
        if(accountInfo.size() > 1){
            this.account.setShared(true);
        }
    }
    //getter for account
    public Account getAccount() {
        return account;
    }
    //get customer details
    public void getCustomerDetails(){
        System.out.println("Name : "+this.getCustomerName()+" Account Number : "+this.getAccount().getAccountId()+
                " Account Balance : "+this.getAccount().getBalance()+" Account Type (Shared?) : "+this.getAccount().isShared()
        );
    }

}
