
       //PROGRAM FOR FACTORIAL OF A GIVEN NUMBER

package com.company;
import java.util.Scanner;
public class practice_itself {
//    static int factorial(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            return n*factorial(n-1);
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number for factorial");
//        int factorial = sc.nextInt();
//        System.out.println("the factorial of the given number is = " +factorial(factorial));


//    }
                //PROGRAM FOR FIBONACCI SERIES...

    static int fib(int n){
        if (n<=1){
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

                public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    System.out.println("enter a number for fibonacci ");
                    int n = sc.nextInt();
                    for (int i=0; i<n; i++)
                    System.out.print(fib(i) + " ");


          }

}





