package com.company;

public class methods {
    // calling a methods

       static   int logic(int x , int y ) {
        int z;
        if (x > y) {
            z = x - y;
        } else {
            z = x +y;
        }
        return z;
    }
    public static void main(String[] args) {
         int a = 9;
        int b = 6;
        int c = logic(a , b);

    //    methods obj = new methods();
      //  int c1 = obj.logic(int a1, int b1);
        int a1= 14;
        int b1 =14;
        int c1;
        c1 = logic(a1,b1);
//        if (a>b){
//            System.out.println(c=a-b);
//        }
//      else {
//            System.out.println( c= a+b);
////        }
//        c = a+b;
       System.out.println(c1);
    }































//    static int logic(int x , int y){
//        int z;
//        if (x>y){
//            System.out.println(z=x+y);
//        }
//        else {
//            System.out.println(z=x-y);
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c=a+b;
//        System.out.println(c*5);
//
//        }


    }
//}