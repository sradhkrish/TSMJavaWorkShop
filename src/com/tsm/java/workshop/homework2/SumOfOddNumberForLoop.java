package com.tsm.java.workshop.homework2;

public class SumOfOddNumberForLoop {
    public static void main(String[] args) {
        int sumOfEvenNumbers=findSum(10);
        System.out.println("Sum of First 10 odd number="+sumOfEvenNumbers);
    }

    private static int findSum(int n) {
        int sum=0;
        int odd = 1;
        for (int i=1;i<=n;i++) {
            sum = sum + odd;
            odd+=2;
        }

        return sum;
    }
}
