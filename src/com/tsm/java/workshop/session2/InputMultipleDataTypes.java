package com.tsm.java.workshop.session2;

import java.util.Scanner;

public class InputMultipleDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        String name=input.next();
        System.out.print("Enter age:");
        int age=input.nextInt();
        System.out.print("Enter salary:");
        float salary=input.nextFloat();
        double tax= salary *.25;
        System.out.println("Calculated Tax for "+name+" with age "+age +" is "+tax);

    }
}
