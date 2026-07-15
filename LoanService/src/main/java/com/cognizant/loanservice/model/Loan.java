package com.cognizant.loanservice.model;

public class Loan {

    private int loanId;
    private String loanType;
    private double amount;

    public Loan() {
    }

    public Loan(int loanId, String loanType, double amount) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.amount = amount;
    }

    public int getLoanId() {
        return loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getAmount() {
        return amount;
    }
}