package com.company;

public class cwk_method_overloading {
    static void foo(int a ,int b){
        System.out.println("good morning " +a+  +b+ "bro");
    }
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning "  + a + "bro!");
    }

    static void change2(int []array){
        array [0] =100;


    }
    static void change(int a){

        a = 78;

    }

    static void telljokes(){
        System.out.println("i am boss");
    }

    public static void main(String[] args) {
     //   telljokes();
        //changing the integer
//        int [] marks ={56,78,98,67,99,92};
//        int x= 45;
//        change(x);

        //changing thr array
//        int [] marks = {56,78,98,67,99,92};
//        change2(marks);
//
//        System.out.println("changing the array after x  is " + marks[0]);

        //method overloading
        foo();
        foo(500 );
        foo(1000,3000);


    }


























//     void greet() throws  InterruptedException{
//         System.out.println("Hello");
//         Thread.sleep(1000);
//         System.out.println("World");
//     }
//
//    public static void main(String[] args) {
//
//    }

    }


//    }

