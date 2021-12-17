package com.company;


class players{
    int jurseynumber;
    String name;
    String nature;
    public void getdetails(){
        System.out.println("My name is " +name);
        System.out.println("My jursey number is " +jurseynumber);
        System.out.println("My quility is "+nature);
    }

}

public class cwk_sp_oops {
    public static void main(String[] args) {
//        System.out.println("its me yaar");
        players player1 = new players();
        players player2 = new players();
        players player3 = new players();
        players  player4 = new players();
        players player5 = new players();
        players player6 = new players();
        players player7 = new players();

        //players attributes
           player1.name="kamlesh";
           player1.nature="right handed batsman and wicket kipper";
           player1.jurseynumber=16;

           player2.name = "Ranjan";
           player2.nature = "right handed batsman and captain ";
           player2.jurseynumber = 45;

           player3.name = "chunnu";
           player3.nature = "Right handed bantsman";
           player3.jurseynumber = 7;

        player4.name = "rajesh";
        player4.nature = "Right handed bantsman";
        player4.jurseynumber = 17;

        player5.name = "rohit";
        player5.nature = "Right handed bantsman";
        player5.jurseynumber = 27;

        player6.name = "pintu";
        player6.nature = "Right handed bantsman";
        player6.jurseynumber = 9;

        player7.name = "Abhishek";
        player7.nature = "Left handed bantsman";
        player7.jurseynumber = 70;

        player1.getdetails();

        player7.getdetails();










    }
}
