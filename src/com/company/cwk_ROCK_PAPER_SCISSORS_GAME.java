package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwk_ROCK_PAPER_SCISSORS_GAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, 0 for Rock , 1 for Paper, 2 for Scissor");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput = random.nextInt(3);
        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1){
            System.out.println("You Win !");
        }
        else {
            System.out.println("Computer Win");

        }
        //System.out.println("Computer choise:" +computerinput);
        if(computerinput==0){
            System.out.println("computer choice: Rock");
        }
        else if(computerinput==1){
            System.out.println("computer choice: paper");
        }
        else if(computerinput==2){
            System.out.println("computer choice: Scisoor");

        }
    }
}
