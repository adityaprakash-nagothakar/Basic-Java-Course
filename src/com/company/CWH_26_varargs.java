package com.company;

public class CWH_26_varargs {
//    static int sum (int a, int b, int c, int d){ // it is a method in which we can sum only one at a time // using one method it solve only one problem
//        return a + b + c + d;
//    }
//    public static void main(String[] args) {
//        System.out.println("welcome to the varargs");
//        System.out.println(" the sum of the a, b, c and d is :-" + sum(34, 56, 3, 9));
//    }
//    static int sum (int ...arr){ // in it we can add multiple integer at a time // one method can solve multiple problems
//        int result=0;
//        for(int element:arr){
//            result+=element;
//        }
//        return result;
//
//    }
//        public static void main(String[] args) {
//        System.out.println("welcome to vargas chapter");
//        System.out.println("The sum of the given number is " + sum());
//        System.out.println("the addition of the a and b is:- " + sum(3, 8));
//        System.out.println("the addition of the a, b and c is:- " + sum(2, 5, 9));
//        System.out.println("the addition od the a, b, s, d, u is :- " + sum(87, 98, 5, 4));
//        System.out.println("the addition od the f, t, y, s, t, w is :- " + sum(9, 5, 7, 9, 3, 5));

//       example 1
//    static int sum (int a, int b, int c, int d){
//        return a + b + c + d;
//    }
//
//    static int sum(int ...A){
//        int result = 0;
//        for (int element:A){
//            result += element;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("welcomt to vargas chapter");
//        System.out.println("the addation of a,b,c,d iss :-" + sum(34, 54, 65, 54));
//    }

    // example 2
    static float sum (float a, float b, float c, float d, float e ){
        return a+b+c+d+e;
    }
    static float sum (float ...value){
        float sum = 0;
        float result = 0;
        for (float element:value){
             result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the value of the a,b,c,d,e is :- " + sum(32.4f, 43.5f, 54.6f, 64.5f, 90.0f));
    }
}
