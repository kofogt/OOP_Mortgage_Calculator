package com.mortgage.com;

public class MortgageTester {


    public static void main(String[] args) {
        Mortgage kofo = new Mortgage(12, 2, 200000, 25);
        System.out.println(kofo.mortgageDue());
    }
}
