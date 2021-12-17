package com.company;

import javax.lang.model.element.NestingKind;
import java.util.Locale;

public class Ch3_PS_string {
    public static void main(String[] args) {
        // QUESTUIN NUMBER 1

        //String name = "KAMLESH";
        //String lstring = name.toLowerCase();
       // System.out.println(lstring);

        //QUESTION NUMBER 3
        String latter = "Dear <name> , thanks a lot";
        String lstring2 = latter.replace("<name>", "kmalesh");
        System.out.println(lstring2);

        //QUESTION NUMBER 5
        System.out.println("Dear Harry \n\t\tThis java course is nice !.\n\t                            Thanks ");

        //QUESTION NUMBER 2
       // String text = "This is kamlesh";
       // text = text.replace(" " , "_");
       // System.out.println(text);

        //QUESTION NUMBER 4
       // String myname = "This  is kamlesh";
        //System.out.println(myname.indexOf("  "));
      //  System.out.println(myname.indexOf("   "));

        //practice

       // String str ="kamlesh";
      //  StringBuffer sbr = new StringBuffer(str);
       // sbr.reverse();
        //System.out.println(sbr);


        String name = "kohli";
        StringBuffer name2 =new StringBuffer(name);
        name2.reverse();
        System.out.println(name2);




    }
}
