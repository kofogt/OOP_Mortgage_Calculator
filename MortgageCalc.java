package com.mortgage.com;

public class MortgageCalc {
    private final Mortgage mortgage;

    public MortgageCalc(Mortgage mortgage) {
        this.mortgage = mortgage;
    }

    public double mortgageDue() {
        double calcPrincipal, calcInterest, calcnumPaymentsDue, mortgageMonthly, topLine, bottomLine;
        calcPrincipal = actualLoan();
        calcInterest = interestRate();
        calcnumPaymentsDue = numPaymentsDue();
        topLine = Math.pow((mortgage.getFIGURE() + calcInterest), calcnumPaymentsDue);
        bottomLine = Math.pow((mortgage.getFIGURE() + calcInterest), calcnumPaymentsDue) - (mortgage.getFIGURE());
        mortgageMonthly = (calcPrincipal * calcInterest * topLine) / (bottomLine);
        return mortgageMonthly;
    }

    public double actualLoan() {
        mortgage.setAmount((mortgage.getAmount()) * ((100 - mortgage.getDownPayment()) / 100));
        return mortgage.getAmount();
    }

    public double interestRate() {
        mortgage.setInterest((mortgage.getInterest() / mortgage.getPERCENTAGE()) / mortgage.getMONTHS());
        return mortgage.getInterest();
    }

    public double numPaymentsDue() {
        mortgage.setYears(mortgage.getYears() * mortgage.getMONTHS());
        return mortgage.getYears();
    }
}