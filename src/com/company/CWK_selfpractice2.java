package com.company;
import java.util.Scanner;

public class CWK_selfpractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Yes you can get marry");
        }
        else{
            System.out.println("No! you are just a kid dear!");
        }
    }
}
