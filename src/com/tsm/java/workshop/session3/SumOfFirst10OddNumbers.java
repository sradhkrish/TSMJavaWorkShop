package com.tsm.java.workshop.session3;

public class SumOfFirst10OddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 1;

        while (count < 10) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 10 odd numbers: " + sum);
    }
}
