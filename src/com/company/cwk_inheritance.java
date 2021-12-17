package com.company;

class base{
     int x;
    public void printMe(){
        System.out.println("its a base class and printing x");
    }
    public void setX(int x){
       this. x =x;
    }
    public int getX(){
        return x;
    }
}

class drived extends base{
    int y;
//    public void printMe(){
//        System.out.println("its derived but used inheritance so printing x and y as well");
//    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}

public class cwk_inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(56);
        System.out.println(b.getX());
        b.getX();
        drived d = new drived();
        d.setY(67);
        d.getY();
        System.out.println(d.getY());
        d.setX(4);
        d.getX();
        System.out.println(d.getX());

    }
}
