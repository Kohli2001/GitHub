package com.company;

class phone{
    public void showtime(){
        System.out.println(" morning 8 o clock!");
    }
    public void on(){
        System.out.println("turing on phone");
    }
}
class samrtphone extends phone{
    public void music(){
        System.out.println("playing music....");
    }
    public void on(){
        System.out.println("truning on smartphone");
    }
}


public class cwk_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new samrtphone();
        obj.on();
      //  obj.music(); //not allowed excpet all methods allowed becoz u cant run a methods which is not present in super class
        obj.showtime();



//        phone obj = new phone();
//        //obj.greet();
//        samrtphone st = new samrtphone();
//        st.greet();
//        st.swagat();
//        st.on();

    }
}
