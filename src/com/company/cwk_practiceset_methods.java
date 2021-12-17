package com.company;
import java.util.Scanner;
public class cwk_practiceset_methods {

    // QUESTION NUMBER 1

//    static void multiplication(int n){
//        for (int i=0; i<=10; i++){
//            System.out.format("%d X %d = %d \n " ,n,i, n*i );
//        }
//    }
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter your number");
////        int n = sc.nextInt();
////        System.out.format(" " +multiplication(n););
//
//        multiplication(5);

 //   }

    //QUESTION  NUMBER 2
//    static void patter1(int n){
//        for (int i=0; i<n; i++){
//            for (int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//     patter1(400 );
//    }


    //QUESTION NUMBER 3
//    static int recsum(int n ){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n+ recsum(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//       int c = recsum(3);
//        System.out.println(c);
//    }

//    static int sumrec(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + sumrec(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
////        int c ;
//      int  c=sumrec(3);
//        System.out.println(c);
//    }

     //QUESTION NUMBER 4
//    static void star(int n){
//        for (int i=4; i>n; i--){
//            for (int j=4; j>i+1; j++){
//
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//
//        }
//    }
//
//    public static void main(String[] args) {
//        star(1);
//    }

    //QUESTION NUMBER 5
//    static int fib(int n){
//        if (n==1){
//            return 0;
//        }
//        else if (n==2){
//            return 1;
//        }
//        else {
//            return fib(n-1)+fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int c = fib(4);
//        System.out.println(c);
//    }

    //QUESTION NUMBER 8

    static void starrec(int n){
        if (n>0){
            starrec(n-1);
            for (int j=0;j<n; j++ ){
                System.out.print(" * ");
            }

            System.out.println();
        }

        }

    public static void main(String[] args) {
        starrec(4);
    }




    }




