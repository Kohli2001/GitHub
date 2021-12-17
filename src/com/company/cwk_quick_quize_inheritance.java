package com.company;


class animal{
    String voice;

    public void setVoice(String v){
        voice = v;
    }
    public String getVoice(){

        return voice;
    }
}
class dog extends animal{
     String burk;
     public void setBurk(String b){
         burk = b;
     }
     public String getBurk(){
         return burk;
     }
}

public class cwk_quick_quize_inheritance {
    public static void main(String[] args) {
        animal ani = new animal();
        ani.setVoice("mewo...meow..burk..burk");
        ani.getVoice();
        System.out.println("this is different type of animal voice");
        System.out.println(ani.getVoice());

        dog dogi = new dog();
        dogi.setBurk("burk...burk...burk..burk");
        dogi.getBurk();
        System.out.println("this is only a dog voice ");
        System.out.println(dogi.getBurk());



    }
}
