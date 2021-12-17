package com.company;

import java.util.Scanner;

public class C_1_practice_set<distanceInMiles> {
    public static void main(String[] args) {
        //QUESTION 1
         int a = 5;
        int b = 6;
        int c = 5;
        int sum = a+b+c;
        System.out.println(sum);

        //QUESTION 2
         float subj1  = 95;
        float subj2  = 80;
        float subj3  = 96;
        float CGPA   = (subj1+subj2+subj3)/30;
        System.out.println(CGPA);

        //QUESTION 3
         System.out.println("enter your name");
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " +name+ " Have a good day!");

//        //QUESTION 5
//            System.out.println("Enter your number");
//          Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());
//
//        //QUESTION 4//QUESTION 1
//         int a1 = 5;
//        int b1 = 6;
//        int c1= 5;
//        int sum1 = a+b+c;
//        System.out.println(sum1);
//
//
//
//        //QUESTION 4
//        System.out.println("enter distance in kilometer");
//        Scanner sc = new Scanner(System.in);
//        double distanceInMiles = sc.nextDouble();
//        System.out.println(distanceInMiles);

    }
}