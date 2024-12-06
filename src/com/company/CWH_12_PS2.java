package com.company;

        import java.util.Scanner;

public class CWH_12_PS2 {
    public static void main(String[] args) {
       /* Q1) float a = 7/4.0f * 9/2.0f;
        System.out.println(a);*/


        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        System.out.println("Eneter the marks oft he students :");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        System.out.println("enter the first marks");
        int b = s.nextInt();
        System.out.println("enter the second marks");
        int c = s.nextInt();
        System.out.println("enetr the third marks");
        int d = s.nextInt();
        System.out.println("enter the fifth marks");
        int e = s.nextInt();
        float total = (a+b+c+d+e)/500.f*100.f;
        System.out.println(total);



        /* Q3) Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>40);*/

        // Q4) v*v - u*u/2*a*5
        /*Scanner a = new Scanner(System.in);
        float v = a.nextFloat();
        Scanner b = new Scanner(System.in);
        float u = b.nextFloat();
        Scanner c = new Scanner(System.in);
        float o = c.nextFloat();
        Scanner d = new Scanner(System.in);
        float s = d.nextFloat();
        float value = (v*v+u*u)/2*o*s;
        System.out.println(value);*/


        /*Q5) float a = 7+49/7f+35/7.0f;
        System.out.println(a);*/



       // Q1
        /*char b = 'e';
        b = (char) (b + 8);
        System.out.println(b);

        b = (char) (b-8);
        System.out.println(b);*/

        System.out.println("enter the number to count");
        Scanner A = new Scanner(System.in);
        System.out.println("value of v = ");
        float v = A.nextFloat();
        System.out.println("val;ue of u = ");
        float u = A.nextFloat();
        System.out.println("value of a =");
        float m = A.nextFloat();
        System.out.println("the total of muntiplication is");
        float E = v*v - u*u / 2.0f *a*5.0f;
        System.out.println(E);






    }
}
