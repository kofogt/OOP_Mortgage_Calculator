package com.mortgage.com;

public class Mortgage {
    private final MortgageCalc mortgageCalc = new MortgageCalc(this);

    public MortgageCalc getMortgageCalc() {
        return mortgageCalc;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getMONTHS() {
        return MONTHS;
    }

    public double getPERCENTAGE() {
        return PERCENTAGE;
    }

    public double getFIGURE() {
        return FIGURE;
    }

    private double downPayment, years, amount, interest;
    final double MONTHS = 12, PERCENTAGE = 100, FIGURE = 1;

    public Mortgage(double downPayment, double years, double amount, double interest) {
        this.downPayment = downPayment;
        this.years = years;
        this.amount = amount;
        this.interest = interest;
    }

    public static void main(String[] args) {

    }



}
