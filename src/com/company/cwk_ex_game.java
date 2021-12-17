
         // Game - GUESS THE NUMBER //
//Game should have the following methods:
//Constructor to generate the random number
//takeUserInput() to take a user input of number
//isCorrectNumber() to detect whether the number entered by the user is true
//getter and setter for noOfGuesses
//Use properties such as noOfGuesses(int)


package com.company;
import java.util.Random;
import java.util.Scanner;


class game{
    public int number;
    public int inputnumber;
    public int noofguesse=0;

    public int getNoofguesse() {
        return noofguesse;
    }

    public void setNoofguesse(int noofguesse) {
        this.noofguesse = noofguesse;
    }
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguesse++;
        if (inputnumber==number){
            System.out.format("Yes ! you guess correct number and it was %d \n and you guessed it in %d attempt", number,noofguesse);
            return true;
        }
        else if (inputnumber<number){
            System.out.println("too low...");
        }
        else if (inputnumber>number){
            System.out.println("too high");
        }
        return false;
    }
}

public class cwk_ex_game {
    public static void main(String[] args) {
        game g = new game();
        boolean b =  false;
        while (!b){
            g.takeuserinput();
            b= g.iscorrectnumber();
        }

    }
}
