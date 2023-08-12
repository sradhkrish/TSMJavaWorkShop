package com.tsm.java.workshop.session3;

public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("John");
        s1.setsNumber(3456);
        s1.setGrade("A+");

        Student s2=new Student();
        s2.setName("Sakthi");
        s2.setsNumber(4561);
        s2.setGrade("A++");

        Student s3=new Student();
        s3.setName("Waseem");
        s3.setsNumber(3451);
        s3.setGrade("A+++");

        System.out.println("Name="+s1.getName()+" Student Number="+s1.getsNumber()+" Grade="+s1.getGrade());
        System.out.println("Name="+s2.getName()+" Student Number="+s2.getsNumber()+" Grade="+s2.getGrade());
        System.out.println("Name="+s3.getName()+" Student Number="+s3.getsNumber()+" Grade="+s3.getGrade());


    }
}
