package com.company;

import java.util.Scanner;

public class CWH_20_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Moves");
        int Human = sc.nextInt();
        switch (Human){
            case 1 -> System.out.println("You have chose Rock");
            case 2 -> System.out.println("You have chose Paper");
            case 3 -> System.out.println("You have chose Scissor");
            default -> System.out.println("Invalid moves ");
        }
        int min = 1;
        int max = 3;
        System.out.println("Computer has chosen");
        int x = (int)
                (Math.random()*(max-min+1)+min);
        switch (x) {
            case 1 -> System.out.println("Computer has chosen Rock");
            case 2 -> System.out.println("Computer hac chosen Paper");
            case 3 -> System.out.println("Computer has chosen Scissor");

        }
        if (Human == x) {
            System.out.println("Match tie");
        }
        else if ((Human ==1 && x==2)||(Human ==2 && x == 3)|| (Human == 3 && x == 1)){
            System.out.println("Computer Won!");
        }
        else if ((Human == 1 && x == 3)|| (Human == 2 && x == 1)|| (Human == 3 && x == 2)){
            System.out.println("Human Won!");
        }
        else if (Human >= 4 ){
            System.out.println("Match cannot be played ");
        }


    }
}
