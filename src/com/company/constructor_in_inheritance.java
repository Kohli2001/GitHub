package com.company;




class Base1{
       Base1(){
        System.out.println("i am a constructor");
    }
    Base1(int a){
      //  super(6);
        System.out.println("i am a constructor of base class with value of a is " +a);
    }


}
class Derived1 extends Base1{
    Derived1(){
      // super();
        System.out.println("i  am i derived class constructor");
    }
    Derived1( int a , int b){
        super(a);
        System.out.println("i am a constructor of derived class with vlaue of b is  " +b);
    }

}
class childofderived extends Derived1{
    childofderived(){
        System.out.println(" i am childofderived class constructor");
    }
    childofderived(int a , int b, int c){
        super(a, b);
        System.out.println("i am a constructor of childofderived class with vlaue of c is " +c);
    }



}
class grandchildofderived extends childofderived{
    grandchildofderived(){
        System.out.println("i am grandchildofderived class constructor");
    }
    grandchildofderived(int a, int b, int c, int d){
       super(a , b, c);
        System.out.println("i am a constructor of grandchildofderived class with value of d is " +d);
    }
}
class mostgrandchildofderived extends grandchildofderived{
    mostgrandchildofderived() {
        System.out.println("i am mostgrandchildofderived class constructor");
    }
        mostgrandchildofderived(int a ,int b, int c, int d, int k){
            super(a,b,c,d);
            System.out.println("i am a constructor of mostgrandchildofderived class with value of k is"  +k);
        }
    }





public class constructor_in_inheritance {
    public static void main(String[] args) {
//       Base1 b = new Base1();
    // Derived1 d = new Derived1(78,5);
      //  Base1 b = new Base1();
      // childofderived cd = new childofderived(10,35,45);
        //grandchildofderived gcd = new grandchildofderived(45,56,67,90);
        mostgrandchildofderived mgcd = new mostgrandchildofderived(54,67,78,90,67);




    }
}

