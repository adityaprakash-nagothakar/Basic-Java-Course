package com.company;
import java.util.Scanner;

public class CWH_13_Multiplication_Table {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Number : ");
        int n = s.nextInt();
        for(int i = 1; i<=20; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
