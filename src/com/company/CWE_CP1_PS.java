package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CWE_CP1_PS {
    public static void main(String[] args){
        System.out.println("The sum of three number is");
        int num1 = 50;
        int num2 = 25;
        int num3 = 55;
        int sum = num1 + num2 + num3;
        System.out.println(sum);

        System.out.println("Enter thr marks of exam");
        float sub1 = 86;
        float sub2 = 89;
        float sub3 = 66;
        float sub4 = 46;
        float sub5 = 59;
        float GPA = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println(GPA/5);

        System.out.println("What is your name : ");
        Scanner a = new Scanner (System.in);
        String name = a.next();
        System.out.println(" Hello " + name + " Have a good day ");
//        Question1 sum of 3 three numbers
      /* System.out.println("This sum of this num is");
        int num1 = 6;
        int num2 = 5;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);

//          Question2 count cgpa using marks of the subject out of 100
        float subject1 = 56;
        float subject2 = 96;
        float subject3 = 57;
        float sum = subject1 + subject2 + subject3;
        System.out.println(sum/3);

//        Quesation3  write the name and get in return that hello name hoe are you
        System.out.println("What is yur name");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " How are you");

//        Question 4 convert km to mit

            System.out.println("Convert to miles ");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number for conversion");
            float a = sc.nextFloat();

            float forVal = 1.609F;

            float converted = a/forVal;
            System.out.println("converted number : ");
            System.out.println(converted);
        

//         Question5 identify the number whether it is int or not
        System.out.println("Enter the number");
        Scanner a = new Scanner(System.in);
        System.out.println(a.hasNextFloat());7*/

    }
}
