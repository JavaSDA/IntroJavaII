package com.company.accounts;

public class Account {

    // Write a class called Account, which models a bank account of a customer. The methods credit(amount) and debit(amount)
    // add or subtract the given amount to
    // the balance. The method transferTo(anotherAccount, amount) transfers the given
    // amount from this Account to the given anotherAccount.


    // Define fields
    private int accountId;
    private String accountName;
    private int balance = 0;

    // define constructor

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    // define getters and setters
    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    // credit method
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // debit method
    public int debit(int amount) {
        balance -= amount;
        return balance;
    }

    // transfer method
    public int transferMoney(Account transferTo, int amount) {
        transferTo.credit(amount); // credit the account being transferred to.
        debit(amount); // debit the account the money was in before.

        return amount;
    }
}
