package com.company;

import java.util.Scanner;

public class CWH_23_Arrays {
    public static void main(String[] args) {
//        1
////        Decleration and memory alocation
//        int [] marks = new int [5];
////        inilatization
//        marks [0]=200;
//        marks [1]=300;
//        marks [2]=400;
//        marks [3]=500;
//        marks [4]=600;
//        System.out.println(marks[4]);

//        2
//        Decleration
//        int [] marks;
//        memory alocation
//        marks = new int [8];
//        initialization
//        marks [0]=22;
//        marks [1]=23;
//        marks [2]=24;
//        marks [3]=25;
//        marks [4]=26;
//        marks [5]=27;
//        System.out.println(marks [3]);


//        3
//        int [] marks = {100, 29, 30, 46, 86, 88};
//        System.out.println(marks[3]);


//        int [] marks ={22, 45, 67, 90, 22};
//        float [] Marks = {23.5f, 43.8f, 78.0f, 11.9f,89.9f};
//        string
//        System.out.println(marks [1]);
//        System.out.println(Marks [4]);
//        System.out.println(marks.length);
//        System.out.println(Marks.length);

//        int [] marks ={45, 67, 68, 34, 70 , 76, 90};
//        System.out.println("output by for loop");
//        for (int i=0; i<= marks.length; i++){
//            System.out.println(marks[i]);
//        }
//        for (int i=marks.length -1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
//        for (int element:marks){
//            System.out.println(element);
//        }

//        int [] [] flats;
//        flats = new int [2] [3] ;
//        flats [0] [0]=101;
//        flats [0] [1]=102;
//        flats [0] [2]=103;
//        flats [1] [0]=201;
//        flats [1] [1]=202;
//        flats [1] [2]=203;
//
//
//        for (int i=0; i<flats.length; i++) {
//            for (int j=0; j<flats[i].length; j++) {
//                    System.out.print(flats[ i ] [ j ]);
//                System.out.print(" ");
//                }
//                System.out.println("");
//            }
//        int [] [] room;
//        room = new int [2] [3];
//        room [0] [0] = 101;
//        room [0] [1] = 102;
//        room [0] [2] = 103;
//        room [1] [0] = 201;
//        room [1] [1] = 202;
//        room [1] [2] = 203;
//
//        for (int i=0;i<room.length;i++){
//            for (int j=0; j<room[i].length;j++){
//                System.out.print(room[ i ] [ j ]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//
//        float [] marks = {45.7f, 67.4f, 12.6f, 90.9f, 78.9f};
//        float sum = 0;
//        for (float elements:marks){
//            sum = sum + elements;
//        }
//        System.out.println("The sum of the marks is " + sum);

//        float [] marks = {34.7f, 56.5f, 87.6f, 43.6f, 67.8f, 87.5f };
//        Scanner S = new Scanner (System.in);
//        System.out.println("Enter the number");
//        float num = S.nextInt();
//        boolean isInArray = false;
//        for (float element:marks){
//            if (num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("Yes it is there in the list");
//        }
//        else{
//            System.out.println("no it's not present in the list");
//        }

        int [] number = {45, 67, 87, 97, 34, 98};
        Scanner A = new Scanner (System.in);
        System.out.println("enter any marks ");
        int NUM = A.nextInt();
        boolean isInArray = false;
        for (int element:number){
            if (NUM==element);
        }
        if (isInArray){
            System.out.println("yes");
        }
        else {
            System.out.println("not");
        }
    }
}
