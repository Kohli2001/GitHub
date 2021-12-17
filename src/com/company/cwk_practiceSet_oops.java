package com.company;

class employees{
    int salary;
    String name;

//    public void getsalary(){
//        System.out.println("My salary is " +salary);
//        System.out.println("My name is " +name);
//    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName( String n){
        name = n;

    }

}
 class CellPhone{

    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
    public  void callfriend(){
        System.out.println("call to Himanshu ");
    }
 }

 class square{
    int side;
    public void area(){
        System.out.println(side*side);
    }
    public int parametre(){
      return 4*side;
    }
 }
 class rectangle{
    int length;
    int width;
    public void area(){
        System.out.println(length*width);
    }
    public int parameter(){
        return 2*(length+width);
    }
 }
 class TommyVecetti{
    public void hit(){
        System.out.println("hiting...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void fire(){
        System.out.println("firing...");
    }
 }

 class circle{
    int r = 2;  //r = radius
     double pi = 3.14;

     public void area(){
         System.out.println(pi*r*r);
     }
 }


public class cwk_practiceSet_oops {
    public static void main(String[] args) {

        //QUSETION 6

        circle cir = new circle();
        cir.area();

        // QUESTION 5

        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();

        // QUESTION 3
        square sq = new square();
      sq.side=3;
       sq.area();
        System.out.println(sq.parametre());

        //Question 4

        rectangle rec = new rectangle();
        rec.length=3;
        rec.width=4;
        rec.area();
        System.out.println(rec.parameter());


        /*

        //QUESTION 2

        CellPhone samsung = new CellPhone();
        samsung.ring();
        samsung.vibrate();
        samsung.callfriend();


        //QUESTION 1

        employees kamlesh = new employees();
        employees salary = new employees();

        kamlesh.salary = 35000;
        System.out.println(kamlesh.getSalary());
           kamlesh.setName("kamlesh");
        System.out.println(kamlesh.getName());
//        kamlesh.salary = 2300;
//        kamlesh.name = "kamlesh";

      //  kamlesh.getsalary();

         */




    }

}
