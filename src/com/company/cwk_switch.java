package com.company;
import java.util.Scanner;

public class cwk_switch {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to became an Adult");
                break;
            case 25:
                System.out.println("you are getting a job");
                break;
            case 60:
                System.out.println("you are going to retired");
                break;
            default:
                System.out.println("Enjoy ur life man");
        }
    }
}
