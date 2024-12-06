package com.company;

import java.util.Scanner;

public class CWH_11_exe_Total_Marks {

    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your English Marks : ");
        int english = scan.nextInt();
        System.out.println("Enter your Science Marks : ");
        int science = scan.nextInt();
        System.out.println("Enter your Mathematic Marks : ");
        int mathematic = scan.nextInt();
        System.out.println("Enter your Physics Marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your Computer science Marks : ");
        int computer = scan.nextInt();
        float percentage = ((english + science + mathematic + physics + computer) / 500.0f) * 100;

        System.out.println("percentage : ");
        System.out.println(percentage);*/

        Scanner scr = new Scanner (System.in);
        System.out.println("Enter your english marks");
        int english = scr.nextInt();
        System.out.println("Enter your maths marks");
        int maths = scr.nextInt();
        System.out.println("Enter your science marks");
        int science = scr.nextInt();
        System.out.println("Enter your marathi marks");
        int marathi = scr.nextInt();
        System.out.println("Enter your hindi marks");
        int hindi = scr.nextInt();
        System.out.println("Enter your computer marks");
        int computer = scr.nextInt();
        float parcantage = ((english + maths + science + marathi + hindi + computer) / 600.0f )*100;
        System.out.println("parcantage: " );
        System.out.println(parcantage + "%");



    }
}
