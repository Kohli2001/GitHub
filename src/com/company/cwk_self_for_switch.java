package com.company;
import java.util.Scanner;

public class cwk_self_for_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        switch (name){
            case "kamlesh":
                System.out.println("Hello Dear! \n Your Welcome ");
                break;
            case"ajay":
                System.out.println("Hello Dear! \n your Welcome");
                break;
            case"sukhit":
                System.out.println("Hello Dear! \n Your Welcome");
                break;
            default:
                System.out.println("NO! You are not my Friend");
                System.out.println("Thanks for using me!");
        }
    }
}
