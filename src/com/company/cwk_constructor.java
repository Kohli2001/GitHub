package com.company;

class mypersonalemployee {
    private int id;
    private String name;

   public mypersonalemployee(){
       id = 34;
       name = " ajay";
   }
   public mypersonalemployee(String myname , int myid){
       id = myid;
       name = myname;

   }

//   public mypersonalemployee(int salary){
//       salary = 10000;
//   }

//   public void setsalary(int rupiya ){
//       rupiya  = 100000;
////   }
//   public int getsalary(){
//       return 10000;
//   }

   public void setName(String n){
       name = n;
   }
   public String getname(){
       return name;
   }
   public void setId(int i){
       id = i;
   }
   public int getid(){
       return id;
   }

}



public class cwk_constructor {
    public static void main(String[] args) {

        mypersonalemployee kamlesh = new mypersonalemployee("sukhit", 95);
      //  mypersonalemployee me = new mypersonalemployee();
      //  mypersonalemployee office  = new mypersonalemployee();
      //kamlesh.setId(18);
       //kamlesh.setName("kamlesh");
        //System.out.println(me .getid());
        //System.out.println(me.getname());
      //  System.out.println(office .getsalary());
        System.out.println(kamlesh.getname());
        System.out.println(kamlesh.getid());


    }
}
