package com.company;

class Circle{
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }


}
class Cylinder extends Circle
{
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}

public class cwk_ps_inheritance {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder();
        cyl.volume();
        System.out.println(cyl.volume());

    }
}
