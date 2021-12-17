package com.company;

public class cwk_methods_overloading2 {
    static void foo(){
        System.out.println("good morning ");
    }
    static void foo(int a ){
        System.out.println("good morning "  +a+  " bro!");
    }
    static void foo(int a , int b){
        System.out.println("hey kamlesh give me my " +a+ " rupees within " +b+  " days");
    }



    static  void change2(int array[]){
        array[0] = 102;
    }
    static void change (int a){
        a= 97;
    }




    static void telljokes(){
        System.out.println("am the king of earth");
    }











    public static void main(String[] args) {
      //  telljokes();

        // chnaging the integer
//        int [] marks = {54,78,97,99,100};
//        int x = 45;
//        change(x);
//        System.out.println(x);
//        //chnaging the array
//        int [] marks = {54,78,97,99,100};
//        change2(marks);
//        System.out.println(marks[0]);
        foo();
        foo(300);
        foo(500,5 );




    }
}
