package com.tsm.java.workshop.session3;

public class MainClass2 {
    public static void main(String[] args) {
        TaxCalculation tc1=new TaxCalculation("Sakthi",700.50);
        System.out.println("Tax Calculation for "+tc1.getName()+" is "+tc1.getTax());
        TaxCalculation tc2=new TaxCalculation("Waseem",800.50);
        System.out.println("Tax Calculation for "+tc2.getName()+" is "+tc2.getTax());
    }
}
