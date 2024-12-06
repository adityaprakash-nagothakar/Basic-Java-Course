package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args){
        /*System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextLine();
        System.out.println(b1);*/
        System.out.println(("Take the input from the user"));
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. 1");
        int a = s.nextInt();
        System.out.println("Enter the no. 2");
        int b = s.nextInt();
        System.out.println("Enter the no. 3");
        int c = s.nextInt();
        System.out.println("Enter the no. 4");
        int d = s.nextInt();
        System.out.println("Enter the no. 5");
        int e = s.nextInt();
        int sum = a + b + c + d + e ;
        System.out.println(sum );
        int total = (sum/5);
        System.out.println(total+"%");
    }
}
