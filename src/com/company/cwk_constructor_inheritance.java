package com.company;


class Base{
//    Base(){
//        System.out.println("i am a constructor");
//    }
    public int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }

}
class Derived extends Base{
    public int y;
    public void setY(int y){
        this.y =y;
    }
    public int getY(){
        return y;
    }
}
public class cwk_constructor_inheritance {
    public static void main(String[] args){
        Base B = new Base();

    }
}