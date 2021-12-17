package com.company;
import java.util.Scanner;

public class cwk_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age;
        age = sc.nextInt();
        if(age>60){
            System.out.println("Your are  pure exprienced!");
        }
        else if(age>45){
            System.out.println("Your are exprienced !");
        }
        else if(age>35){
            System.out.println("Your are semi exprienced !");
        }
        else{
            System.out.println("No! You are not exprienced");
        }
    }
}
