package com.tsm.java.workshop.session3;

public class PayrollProcessing {
    private final String name;
    private final int hour;
    private final double ratePerHour;
    private double grossSal;

    public PayrollProcessing(String name, int hour, double ratePerHour) {
        this.name=name;
        this.hour=hour;
        this.ratePerHour=ratePerHour;
        this.grossSal=hour*ratePerHour;
    }

    public String getName() {
        return this.name;
    }

    public double getGrossSalary() {
        return this.grossSal;
        
    }
}
