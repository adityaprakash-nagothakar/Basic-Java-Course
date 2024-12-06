package com.company;

public class CWH_24_Method {
//    static int logic(int x, int y){
//        int z;
//        if(x>y){
//            z = x + y;
//        }
//        else{
//            z = (x + y) * 5;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        int a = 51;
//        int b = 45;
//        int c;
//        CWH_24_Method obj = new  CWH_24_Method();
//        c = obj.logic(a, b);
//        int a1 = 5;
//        int b1 = 8;
//        int c1;
//        c1 = logic(a1, b1);
//        System.out.println("your ans is  :-");
//        System.out.println(c);
//        System.out.println(c1);
//
//    }
//
    static float logic (float x, float y){
        float z;
        if (x > y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        float a = 9.4f;
        float b = 2.1f;
        float c;
        c = logic (a, b);
        float e = 5.4f;
        float f = 2.1f;
        float g;
        g = logic (e, f);
        System.out.println(c);
        System.out.println(g);

    }

}
