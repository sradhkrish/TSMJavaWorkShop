package com.tsm.java.workshop.session3;

public class MainClass {
    public static void main(String[] args) {
        PayrollProcessing pp1=new PayrollProcessing("Sakthi",40,17.50);
        System.out.println("Net Salary for "+pp1.getName()+" is "+pp1.getGrossSalary());

        PayrollProcessing pp2=new PayrollProcessing("Naithan",40,18.50);
        System.out.println("Net Salary for "+pp2.getName()+" is "+pp2.getGrossSalary());

        PayrollProcessing pp3=new PayrollProcessing("John",40,14.50);
        System.out.println("Net Salary for "+pp3.getName()+" is "+pp3.getGrossSalary());

    }
}
