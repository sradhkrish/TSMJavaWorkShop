package com.tsm.java.workshop.session2;

public class MultiplicationAndDivision {
    public static void main(String[] args) {
        int result1=multiplication(10,15);
        System.out.println("Result of Multiplication="+result1);

        int result2=division(50,10);
        System.out.println("Result of Multiplication="+result2);
    }

    public static int division(int x, int y) {
        return x/y;
    }

    private static int multiplication(int x, int y) {
        return x*y;
    }
}
