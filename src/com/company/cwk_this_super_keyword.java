package com.company;


class ekclass{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super();
        System.out.println("i am a constructor");
    }
}
class triclass extends doclass{
    triclass(int k){
        super(k);
        System.out.println("im a constructor of triclass");
    }
}


public class cwk_this_super_keyword {
    public static void main(String[] args) {
        ekclass e = new ekclass();
        e.setA(8);
        //System.out.println(e.getA());
        //doclass d = new doclass(6);
        triclass t = new triclass(90);


    }
}
