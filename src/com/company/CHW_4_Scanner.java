package com.company;

import java.util.Scanner;

public class CHW_4_Scanner {
    public static void main(String[] args) {
        System.out.println("Percentage of student");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the marks of sub 1:");
        float MA = S.nextFloat();
        System.out.println("Enter the marks of sub 2:");
        float PHY = S.nextFloat();
        System.out.println("enter th marks of sub 3:");
        float GEO = S.nextFloat();
        System.out.println("Enter the marks of sub 4:");
        float totalMarks = MA/3+PHY/3+GEO/3;
        System.out.println("The total parcantage of student is :-");
        System.out.println(totalMarks);

    }
}
