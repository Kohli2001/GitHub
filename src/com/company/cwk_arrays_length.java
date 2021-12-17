package com.company;

public class cwk_arrays_length {
    public static void main(String[] args) {
          int marks[]={34,90,45,76,67};
          System.out.println(marks.length);

        System.out.println(marks[4]);
      //  double marks[]={34.9,90.4,45.3,76.0,67.1};
        String []students = {"ram" ,"kamlesh" , "ajay" ,"pintu" ,"rajesh" ,"vinay"};
        System.out.println(students[2]);
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // reverse oder using loops
        for (int i=marks.length -1; i>=0; i--) {

            System.out.println(marks[i]);
        }
        System.out.println(marks[2]);



    }


}
