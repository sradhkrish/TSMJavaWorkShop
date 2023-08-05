package com.tsm.java.workshop.session2;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        int sumofNaturalNum=calculate (40);
        System.out.println("Sum of Natural Number from 1 to 40 ="+sumofNaturalNum);

        int sumofNaturalNumWithFrm=calculateSumOfNaturalNumberWithFormula (40);
        System.out.println("Sum of Natural Number from 1 to 40 Using Formula ="+sumofNaturalNumWithFrm);


    }

    private static int calculateSumOfNaturalNumberWithFormula(int n) {
        return n*(n+1)/2;

    }

    private static int calculate(int x) {
        int sum=0;
        for (int i=1;i<=x;i++) {
            sum = sum + i;
            System.out.println("sum="+sum);
        }
         return sum;
    }

}
