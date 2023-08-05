package com.tsm.java.workshop.session2;

import java.util.Scanner;

public class InputYouValueAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = input.nextInt();
        System.out.print("Enter the value of y:");
        int y = input.nextInt();
        int sum=x+y;
        System.out.println("Sum of x and y="+sum);

    }
}
