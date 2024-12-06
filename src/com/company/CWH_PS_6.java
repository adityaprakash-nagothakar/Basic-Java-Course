package com.company;

import java.util.Scanner;

public class CWH_PS_6 {
    public static void main(String[] args) {
//        Q 1
//        float [] marks = {83.5f, 86.7f, 76.7f, 98.7f, 99.6f};
//        float sum = 0;
//        for (float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("the value of the sum is " + sum);
//         Q2
//        int [] Marks = {34, 56, 78, 98, 99};
//        Scanner s = new Scanner (System.in);
//        System.out.println("enter thr number :-");
//        int num = s.nextInt();
//        boolean isInArray = false;
//        for (int element:Marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("the givem intiger is present in the array");
//        }
//        else {
//            System.out.println("the given intiger ius not present in the array");
//        }
//        Q 3
//        int [] marks = {98, 76, 54, 90, 95};
//        int sum = 0;
//        for (int element:marks){
//            sum = sum + element;
//        }
//        System.out.println("teh everage of the marks is the :-"+ sum/ marks.length);

//         Q4
//        int [] [] mat1 = {{1, 2, 3}, {4, 5, 6}};
//        int [] [] mat2 = {{4, 5, 8}, {7, 3, 9}};
//        int [] [] result = {{0, 0, 0}, {0, 0, 0}};
//
//        for (int i=0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                System.out.format(" setting value of i=%d and j=%d\n" , i, j);
//                result[i] [j] = mat1[i] [j] + mat2[i] [j];
//
//            }
//        }
//        for (int i=0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                System.out.print(result [i] [j] + " ");
//                result[i] [j] = mat1[i] [j] + mat2[i] [j];
//            }
//            System.out.println(" ");
//        }
// @ 5)
//        int [] arr = {1, 2, 3, 4, 5, 6, 7};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element : arr){
//            System.out.println(element);
//        }

//        Q 6)
//        int [] arr = {22, 45, 69, 81, 44, 89};
//        int max = 0;
//        for (int element:arr){
//            if(element>max){
//                max = element;
//            }
//        }
//        System.out.println("the max element is " + max);

//        Q 7)
        int [] apn = {34, 56, 74, 12, 45};
        int min = 74;
//        int min = Integer.MIN_VALUE;
        for (int element:apn){
            if(element<min){
                min = element;
            }
        }
        System.out.println("the min element is " + min);

//        Q8)
        int [] arr = {1, 4, 7, 4, 32};
        boolean isSorted = true;
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not Sorted");
        }
    }
}

