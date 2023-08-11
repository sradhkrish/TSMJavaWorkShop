package com.tsm.java.workshop.homework2;

public class SumOfEvenNumberForLoop {
    public static void main(String[] args) {
        int sumOfEvenNumbers=findSum(10);
        System.out.println("Sum of Even number from 1..10="+sumOfEvenNumbers);
    }

    private static int findSum(int n) {
        int sum=0;
        int even = 2;
        for (int i=1;i<=n;i++) {
            sum = sum + even;
            even+=2;
        }

        return sum;
    }
}
