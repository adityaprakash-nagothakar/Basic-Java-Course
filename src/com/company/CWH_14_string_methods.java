package com.company;


import java.util.Scanner;

public class CWH_14_string_methods {
    public static void main(String[] args){
        String name = "Aditya P Nagothakar";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String Name = name.toLowerCase();
        System.out.println(Name);
        String Upper = name.toUpperCase();
        System.out.println(Upper);
        String R = name.trim();
        System.out.println(R);
        String sub = name.substring(6);
        String su = name.substring(5,12);
        System.out.println(sub + su);
        System.out.println(name.replace('A','Z'));
        System.out.println(name.startsWith(" "));
        System.out.println(name.endsWith(" "));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("r"));
        System.out.println(name.equals("Aditya P Nagothakar"));



        //Scanner sc = new Scanner(System.in);
        //String st = sc.next();
        //String st = sc.nextLine();
        // System.out.println(st);
        //String a = "aditya";
         //String a1 = new String("adityad");

    }

}
