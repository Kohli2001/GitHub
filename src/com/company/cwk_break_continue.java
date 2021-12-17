package com.company;

public class cwk_break_continue {
    public static void main(String[] args) {
  //      int i = 0;
  //      while(i<=5){
//            System.out.println(i);
//            System.out.println("oho great !");
//            i++;
//            if(i==2){
//                System.out.println("let me check once" );
//                break;
//            }
//        for(int i=0; i<=5; i++ ){
//            System.out.println(i);
//            System.out.println("its really grt yaar!");
//             if(i==2){
//                 System.out.println("its done yaar! not more");
//                 break;
//
//             }
        for(int i=0; i<=5; i++){
            if(i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("that's it");




        }

    }
}