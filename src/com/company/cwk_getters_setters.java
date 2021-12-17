package com.company;


class myemployee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class cwk_getters_setters {
    public static void main(String[] args) {

        myemployee details = new myemployee();
        details.setId(45);
        System.out.println(details.getId());
        details.setName("kamlesh");
        System.out.println(details.getName());


       // details.id = 25;
       // details.name= "kamlesh"; ---> throw error due to private access modifier




    }
}
