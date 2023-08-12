package com.tsm.java.workshop.session3;

public class TaxCalculation {
    private final double tax;

    public String getName() {
        return name;
    }

    private final String name;
    private final double gs;

    public double getTax() {
        return tax;
    }

    public TaxCalculation(String name, double gs) {
        this.name=name;
        this.gs=gs;
        this.tax=gs*.25;
    }
}
