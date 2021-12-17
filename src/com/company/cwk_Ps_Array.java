package com.company;

import java.util.Scanner;

public class cwk_Ps_Array {
    public static void main(String[] args) {

        // QUESTION NUMBER 1
//         float [] marks ={1.6f,5.7f,6.5f,1.5f,3.5f};
//         float sum=0;
//         for (float element:marks){
//             sum = sum+ element;
//
//         }
//        System.out.println("the sum of the given number is "  +sum);


        //QUESTION  NUMBER 2
//        int[] marks = {45, 23, 32, 12, 3, 4, 11, 22, 76};
//        int num = 45;
//        boolean isInarray = false;
//        for (int element : marks) {
//            if (num == element) {
//                isInarray = true;
//                break;
//
//            }
//        }
//            if (isInarray) {
//                System.out.println("the given value presnt in the array");
//            } else {
//                System.out.println("the value is not present in the array");
//            }

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number");
//        int [] marks ={34,76,98,90,45,48,23,};
//        int num= sc.nextInt();
//        boolean isInArray= false;
//        for (int element:marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//
//            }
//        }
//            if (isInArray){
//                System.out.println("Yes ! the enetered value is present  in array");
//            }
//            else {
//                System.out.println("No! the entered value is not present in the array");
//            }
//        int [] marks = {90,95,80,75,30};
//        int sum=0;
//        for (int element:marks){
//            sum = sum + element;
//
//        }
//        System.out.println("the average of the given value is " +sum/marks.length);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your physics marks");
//        int [] marks ={};
//        int sum =sc.nextInt();
//        for (int element:marks){
//            sum= sum+ element;
//
//        }
//        System.out.println("the average of the marks is " +sum/marks.length);


       //  QUESTION  NUMBER 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the mat1 values");
//        int mat1=sc.nextInt();
//        int [][] mat1={};
////        int [][] mat1 = {{1,2,3},
////                          {4,5,6}};
//        int [][] mat2 = {{2,4,6},
//                         {8,10,12}};
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for (int i =0; i<mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for (int i=0; i< mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
        // QUESTION NUMBER 5
//        int [] arr = {1,2,3,4,5,6};
//        int l= arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//
//        }
//        for (int element:arr){
//            System.out.print(element + " ");

//         int [] array = {11,22,33,44,};
//         int l= array.length;
//         int n = Math.floorDiv(l,2);
//         int temp;
//         for (int i=0; i<n; i++){
//             temp = array[i];
//             array[i] = array[l-i-1];
//             array[l-i-1]= temp;
//         }
//         for (int element:array){
//             System.out.print(element + " ");
//         }
        //QUESTION NUMBER 6
//        int [] array = {1,11,3,33,4,44,7,77};
//        int max = 0;
//        for (int element:array){
//            if (element>max){
//                max= element;
//            }
//
//        }
//        System.out.println(max);

//        // QUESTION NUMBER 7
//        int [] array = {22,56,1,78,90,};
//        int min = Integer.MIN_VALUE;
//        for (int element:array){
//            if (element<min){
//                min =  element;
//            }
//        }
//        System.out.println(min);


        // QUESTION NUMBER 8
        boolean Issorted = true;
        int [] array = {1,5,44,55,78};

        for (int i=0; i<array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                Issorted = false;
                break;
            }
        }
            if (Issorted){
                System.out.println("the Array is sorted");
            }
            else {
                System.out.println("the Array is not sorted");
            }
        }

      }









