package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

import static com.company.CWH_26_varargs.main;
import static com.company.CWH_26_varargs.sum;

public class CWH_PS_7 {
//    Q1)
//   static void multiplication (int n){
//       for (int i=1; i<=10; i++){
//           System.out.format("%d x %d = %d\n", n, i, n*i);
//       }
//   }
//
//    public static void main(String[] args) {
//        multiplication(7);
//    }
//    Q2)
//    static void pattern (int n){
//       for (int i=0; i<=n; i++){
//           for (int j=0; j<=i+1; j++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }
//    }
//
//    public static void main(String[] args) {
//        pattern(7);
//    }
//    Q3)

//    static int sumRect(int n){
//        if(n==1){
//            return 1;
//        }
//        return n + sumRect(n-1);
//    }
//
//    public static void main(String[] args) {
//        int c = sumRect(4);
//        System.out.println(c);
//    }
//    Q4)
//    static void pattern(int n){
//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        pattern(5);
//    }

//     Q 5)
//    static int fib (int n){
//        if (n==1){       //  user can used this
//            return 0;
//        }
//        else if (n==2){
//            return 1;
//        }
//        if (n==1 || n==2){      // or this both will show the sem result
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib (n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = fib(7);
//        System.out.println(result);
//    }

//     Q 6)

//    static int varargs (int ...arr){
//        int result = 0;
//        for (int element:arr){
//            result += element;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("the average of the set of number [passes as the argument is :- \n");
//        System.out.println("the average of thge num,ber 4, 5, 6 and 8 is :- \n" + sum(4, 5, 6, 8));
//    }

//     Q 7)
//
//    static void pattern_rec (int n) {
//      if ( n == 0){
//
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//    public static void main(String[] args) {
//        pattern_rec(7);
//    }


//    Q 8)

//    static void pattern_rec ( int n){
//        if (n > 0) {
//
//            pattern_rec(n - 1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern_rec(6);
//    }

//     Q 9)

    static double temperature(float c ){
        return (c*1.8)+32;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of Celsium(C) :- ");
        float t = S.nextFloat();
        System.out.println("Celsius to fahrenheit temperature is : " + temperature(t) +" F");
    }
}
