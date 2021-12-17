package com.company;

public class cwk_variable_arguments {
    static int sum( int...arr){
        int result=0;
        for (int a: arr){
            result += a;
        }
        return result;

    }
//    static int sum(int a ,int b){
//        return a+b;
//    }
//    static int sum(int a  , int b , int c){
//        return a+b+c;
//    }
    public static void main(String[] args) {
       // System.out.println("the sum of the nothimg is = " +sum(5));
        System.out.println("the sum of the nothimg is = " +sum());
        System.out.println("the sum of the value is = " +sum(1));
        System.out.println("the sume of 4 and 5 = " +sum(4, 5));
        System.out.println("the sume of 4 ,5 and 8 = " +sum(4, 5 , 8 ) );

    }
}
