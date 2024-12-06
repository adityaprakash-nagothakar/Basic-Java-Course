package com.company;

public class CWH_26_Method_Overloading {
////    static void change(int a){
////        a = 89;
////    }
//    static void replace(int[] arr){
//        arr [1] = 88;
//    }
//    static void replace2(int [] arr){
//        arr [3] = 43;
//    }
//
//    public static void main(String[] args) {
//        int [] marks = {52, 73, 77, 89, 98, 94};
//        replace(marks);
//        replace2(marks);
//        System.out.println("the value of the intiger has been change  " + marks[1] + marks [3]);
    static void aditya (int[] arr){ // the function name is aditya, if you want to replace or changr the intiger put propper staps
        arr[2] = 45;
    }

    public static void main(String[] args) {
        int [] marks = {89, 76, 65, 45, 34};
        aditya(marks);
        System.out.println("the value which you has been replace is :-" + marks[2]);
    }
}

