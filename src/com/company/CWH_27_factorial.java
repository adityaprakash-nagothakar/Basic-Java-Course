package com.company;

public class CWH_27_factorial {
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }

    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("the value of factorial x is : " + factorial(x));

    }
}
