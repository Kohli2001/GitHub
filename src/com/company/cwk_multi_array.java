package com.company;



public class cwk_multi_array {
    public static void main(String[] args) {
        int [][] flats;
        flats = new int [2][3];
        flats[0][0]=104;
        flats[0][1]=105;
        flats[0][2]=106;
        flats[1][0]=107;
        flats[1][1]=108;
        flats[1][2]=109;
        for (int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length;j++ ){

                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.print("\n");

        }







    }
}
