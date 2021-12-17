package com.company;
import java.util.Scanner;

public class subj_percentage {
    public static void main(String[] args) {
       // System.out.println("this is kamlesh");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the subj1");
        int subj1 = sc.nextInt();
        System.out.println("enter the subj2");
        int subj2 = sc.nextInt();
        System.out.println("enter the subj3");
        int subj3 = sc.nextInt();
        System.out.println("enter the subj4");
        int subj4 = sc.nextInt();
        System.out.println("enter the subj5");
        int subj5 = sc.nextInt();
        int sum = subj1+subj2+subj3+subj4+subj5;
        System.out.println("percentage of your marks is: ");
        System.out.println(sum/5);



    }
}
