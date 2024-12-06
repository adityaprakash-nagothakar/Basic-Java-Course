package com.company;

import java.util.Scanner;

public class CWE_5_takinginput {
    public static void main(String[] args){
        System.out.println("Taking Input From thr User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();   //can also put float for 25.25 kind of num
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the number is");
        System.out.println(sum);






    }
}

