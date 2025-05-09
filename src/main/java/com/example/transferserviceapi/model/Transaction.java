package com.example.transferserviceapi.model;

public class Transaction {
    private String sourceAccount;
    private String destinationAccount;
    private double amount;

    //Constructor to create a new Transaction
    public Transaction(String sourceAccount, String destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public String getSourceAccount() { return sourceAccount; }
    public String getDestinationAccount() { return destinationAccount; }
    public double getAmount() { return amount; }
}
