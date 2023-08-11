package com.tsm.java.workshop.homework2;

public class SumOfEvenNumberUsingFormula {
    public static void main(String[] args) {
        int sumOfEvenNumbers=findSum(10);
        System.out.println("Sum of Even number from 1..10="+sumOfEvenNumbers);
    }


    private static int findSum(int n) {
        return n*(n+1);
    }

}
