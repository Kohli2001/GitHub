package com.company;
import java.util.Scanner;

public class cwk_do_while_loop {
    public static void main(String[] args) {

  // PROGRAM FOR A LEAP YAER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if(year%400 == 0 || year%4 == 0 && year%100 !=0 ){
            System.out.println(" This is a LeapYear" );
        }
        else {
            System.out.println(" This ia not a LeapYear" );
        }

//        int a = 100;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while (a<50);

    }
}
