package com.company;

public class CWH_17_logical {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false;
        boolean c = true;
        if (a || b & c){
           System.out.println("yes");

        }
        else {
            System.out.println("not");

        }
        System.out.println("for logical not");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);
        System.out.println("Not(c) is ");
        System.out.println(!c);

        boolean f = true;
        boolean d = false;
        if (f||d){
            System.out.println("Y");

        }
        else {
            System.out.println("N");
        }

    }

}
