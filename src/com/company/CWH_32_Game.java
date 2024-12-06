package com.company;

import java.util.Random;
import java.util.Scanner;
class Guess_game{
        private final int comp_num;
        private int user_num;
        private int chances;

        Guess_game() {
            System.out.println("Welcome to the game:");
            Random R = new Random();
            comp_num = R.nextInt(100);
            chances = 0;
        }

        void user_input(int x) {
            user_num = x;
        }

        void correct_number() {
            if (user_num > comp_num) {
                System.out.println("You select the big number:");
                chances++;
            }
            else if (user_num < comp_num) {
                System.out.println("You select the small number: ");
                chances++;
            }
            else {
                System.out.println("You got it right");
                chances++;
                System.out.println("Non of chances you taken: " + chances);
            }
        }
    }
    class program {
        public class CWH_32_Game {
        public static void main(String[] args) {
            Guess_game player1 = new Guess_game();
            while (true) {
                int n;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the user number :");
                n = sc.nextInt();
                player1.user_input(n);
                player1.correct_number();
                }
            }
    }
}