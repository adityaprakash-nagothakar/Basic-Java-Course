package com.company;

import java.util.Scanner;

public class CWH_22_PS_5 {
    public static void main(String[] args) {
        //1
//      for (int i=1; i<=6; i++){
//          for (int j=1; j<=i ; j++){
//              System.out.print("*");
//          }
//          System.out.println(" ");
//      }
//
//
//      //2
//      for (int a=1; a<=7; a++){
//          for (int b=7; b>=a; b--){
//              System.out.print("*");
//          }
//          System.out.println(" ");
//      }
//println
        //3
//        int sum = 0;
//        int n = 3;
//        int A = 0;
//      while (A<n) {
//          sum = sum + (2*A);
//          System.out.println(sum);
//          A++;
//          }
        // Q 2)
//        int sum = 0;
//        int n = 8;
//        for (int i=0; i<n; i++) {
//            sum = sum + (2*i);
//        }
//        System.out.println(sum);
//
//        int sum = 0;
//        int m = 0;
//        while (m < 3){
//            sum = sum + (2*m);
//            m++;
//        }
//        System.out.println(sum);
//     Q 3)
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int n = s.nextInt();
//
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d x %d = %d\n", n, i, n*i);
//        }
//        Q 4)
//        Scanner S = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int N = S.nextInt();
//        for (int I=10; I>=1; I--){
//            System.out.printf("%d x %d = %d\n", N, I, N*I);
//        }
//        q 6)
//        Scanner S = new Scanner (System.in);
//        System.out.println(" Enter the number: ");
//        int factorial = 1;
//        int N = S.nextInt();
//        for (int i=1; i<=N; i++){
//            factorial *= i;
//            System.out.println(factorial);
//    }
//
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while (i<=n) {
//            factorial *= i;
//            i++;
//        }
//            System.out.println(factorial);

//        Scanner S = new Scanner(System.in);
//        System.out.println(" ");
//        int a = S.nextInt();
//        int factorial = 1;
//        int i = 1;
//        while (i<=a){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
//        Q 7)
//        for (int i=1; i<=6; i++){
//            for (int j=6; j>=i; j--){
//                System.out.print("&");
//            }
//            System.out.println("*");
//        }
//        for (int a=1; a<=6; a++){
//            for (int b=1; b<=a; b++){
//                System.out.print("*");
//            }
//            System.out.println("&");
//        }
//        Q8)
        Scanner A = new Scanner (System.in);
        System.out.println("Enter the number");
        int P = A.nextInt();
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", P, i, P*i);
        }

        int n = 5;
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);

    }
}
