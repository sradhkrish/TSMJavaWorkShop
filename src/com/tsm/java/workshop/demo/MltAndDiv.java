package com.tsm.java.workshop.demo;

public class MltAndDiv {
    public static void main(String[] args) {
        int result1 = mul(12,20);
        System.out.println("Result1="+result1);

        int result2 = divide(20,5);
        System.out.println("Result2="+result2);


    }

    private static int divide(int i, int i1) {
        return i/i1;
    }


    private static int mul(int x, int y) {

        return x*y;
    }

}
