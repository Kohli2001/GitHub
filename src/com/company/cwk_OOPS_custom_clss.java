package com.company;




class employee{
       int  id;
     String name;
     public  void getdetails(){
         System.out.println("My id is " +id);
         System.out.println("My name is " +name);



     }

}

public class cwk_OOPS_custom_clss {
    public static void main(String[] args) {
        System.out.println("this is my custom class ");


        employee kamlesh = new employee();// creating object class
        employee ajay = new employee(); // creating object class

        //setting the attributes
        kamlesh.id = 24;
        kamlesh.name="CodWithKamlesh";
        ajay.id = 17;
        ajay.name = "ajay sharma";

        //printing the attributes
        kamlesh.getdetails();
        ajay.getdetails();
        //System.out.println(kamlesh.id);
        //System.out.println(kamlesh.name);



    }
}
