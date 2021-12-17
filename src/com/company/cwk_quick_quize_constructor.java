package com.company;



class emlpoyee {
  private  String name;
  private int salary;
  private float salary1;

    public  emlpoyee(String myname , int mysalary){
        name = myname;
        salary =mysalary;


    }
    public emlpoyee(int newsalary){
        salary = newsalary;
    }
    public emlpoyee(float  finalsalary){
        salary1 = finalsalary;

    }
    public void setSalary1(float d){
        salary1 = d;
    }
    public float getsalary1(){
        return salary1;
    }

//    public void setsalary(int i){
//        salary = i;
//    }
//    public int getsalary(){
//        return salary;
//    }
//    public void setnewsalary(int salary1){
//        salary = salary1;
//    }
//    public int getnewsalary(){
//        return salary;
//    }

    public void setName(String n) {
    name = n;

    }

    public String getName() {
        return name ;
    }

    public void setSalary(int salary1) {
        salary = salary1;
    }

    public int getSalary() {
        return salary;
    }
}

public class cwk_quick_quize_constructor {
    public static void main(String[] args) {
    emlpoyee kamlesh = new emlpoyee( 30000);
        emlpoyee ajay= new emlpoyee( 50000);

        emlpoyee sukhit = new emlpoyee( 5000);


        System.out.println(ajay.getSalary());
        System.out.println(kamlesh.getSalary());
        System.out.println(sukhit.getSalary());


    }
}
