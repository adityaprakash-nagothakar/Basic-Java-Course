package com.company;
class Cylinder{
    private int Radius;
    private int Height;

////      Question 1
//    public int getRadius() {
//        return Radius;
//    }
//    public void setRadius(int radius) {
//        Radius = radius;
//    }
//    public int getHeight() {
//        return Height;
//    }
//    public void setHeight(int height) {
//        Height = height;
//    }
//
////   question 2
//    public double getSurfaceArea(){
//        return 2* 3.14 * Radius * Radius + 2 *3.14 * Radius * Height;
//    }
//    public double getVolume(){
//        return .14 * Radius * Radius * Height;
//    }
//
////    Question 3
//    public Cylinder(int radius, int height){
//        this.Radius = radius;
//        this.Height = height;
//    }
//    Question 4
//class Rrectangle{
//        private int Length;
//        private int Breadth;
//
//        public Rrectangle(){
//            this.Length = 4;
//            this.Breadth = 5;
//        }
//        public Rrectangle(int Length, int Breadth){
//            this.Length = Length;
//            this.Breadth = Breadth;
//        }
//
//    public int getLength() {
//        return Length;
//    }
//
//    public int getBreadth() {
//        return Breadth;
//    }
//}
    public int getRadius(){
        return Radius;
    }
    public void setRadius(int radius){
        Radius  = radius;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
public class CWH_33_PS_9 {
    public static void main(String[] args) {
//        Cylinder C = new Cylinder(34,5);       // the bracket value is the part of question 3
//
////        Question 1
////        C.setHeight(22);
////        System.out.println(C.getHeight());      //We can used both Method        method 1
////        C.setRadius(12);
////        int R = C.getRadius();              // Method 2
////        System.out.println(R);*/
//        System.out.println("The Output of Q 1 is : ");
//        C.setRadius(8);
//        System.out.println(C.getRadius());
//        C.setHeight(6);
//        System.out.println(C.getHeight());
//
////        question 2
//        System.out.println("The output of Question 2 is :");
//        System.out.println(C.getSurfaceArea());
//        System.out.println(C.getVolume());
//
////       Question 3
//        System.out.println("The output of Question 3 is :");
//        System.out.println(C.getRadius());
//        System.out.println(C.getHeight());
//
//        question 4
//        Rrectangle r = new Rrectangle(12, 43);        // user can also used this () command
//        System.out.println(r.getBreadth());
//        System.out.println(r.getLength());
        Cylinder c = new Cylinder();
        c.setHeight(3);
        System.out.println(c.getHeight());
        c.setRadius(1);
        System.out.println(c.getRadius());

    }
}


