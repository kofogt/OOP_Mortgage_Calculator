package com.mortgage.com;

import java.text.DecimalFormat;

public class MortgageCalc {
    private final Mortgage mortgage;

    public MortgageCalc(Mortgage mortgage) {
        this.mortgage = mortgage;
    }

    public String mortgageDue() {
        DecimalFormat df = new DecimalFormat("0.00");
        double calcPrincipal, calcInterest, calcnumPaymentsDue, mortgageMonthly, topLine, bottomLine, totalPay;
        calcPrincipal = actualLoan();
        calcInterest = interestRate();
        calcnumPaymentsDue = numPaymentsDue();
        topLine = Math.pow((mortgage.getFIGURE() + calcInterest), calcnumPaymentsDue);
        bottomLine = Math.pow((mortgage.getFIGURE() + calcInterest), calcnumPaymentsDue) - (mortgage.getFIGURE());
        mortgageMonthly = (calcPrincipal * calcInterest * topLine) / (bottomLine);
        totalPay = mortgageMonthly * calcnumPaymentsDue;
        return "You will pay $" + df.format(mortgageMonthly) + "monthly. The total payment will be $" + df.format(totalPay);
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
