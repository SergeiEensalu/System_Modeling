package com.bank.application;

import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    public void test1() {
        Bank b = new Bank();
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");
        Customer charlie = new Customer("Charlie");
        Account ab = new Account(b, "32442545");
        Account ac = new Account(b, "44543214");
        alice.setAccount(ab);
        bob.setAccount(ab);
        charlie.setAccount(ac);
        ab.deposit(20000);
        ac.deposit(10000);
        System.out.println("Total Assets: "+ b.getTotalAssets()); // <- prints 30000
    }
    @Test
    public void test2() {
        Bank b = new Bank();
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");
        Customer charlie = new Customer("Charlie");
        Account ab = new Account(b, "32442545");
        Account ac = new Account(b, "44543214");
        alice.setAccount(ab);
        bob.setAccount(ab);
        charlie.setAccount(ac);
        ab.deposit(20000);
        ac.deposit(10000);
        alice.getCustomerDetails();
        bob.getCustomerDetails();
        ab.convertSharedAccountToPrivate(0.5);
        alice.getCustomerDetails();
        bob.getCustomerDetails();

        System.out.println("Total Assets: "+ b.getTotalAssets()); // <- prints 30000
    }

}