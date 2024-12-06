package com.company;
//   Question 1
//class Employee1{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n) {
//        name = n;
//    }
//}
//   question 2
//class CellPhone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//    public void vibrate(){
//        System.out.println("vibrating...");
//    }
//
//    public void callFriend(){
//        System.out.println("Calling...");
//    }
//}
//     question 3
//class Square{
//    int side;
//    public int ares(){
//        return side * side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//     question 4
//class Rectangle{
//    int Length;
//    int Width;
//    public int area(){
//        return Length * Width;
//    }
//    public int perimeter(){
//        return 2*Length+Width;
//    }
//}
//     question 5
//class Tommy{
//    public void hit (){   // method
//        System.out.println("Hitting the enemy");
//    }
//    public void run (){
//        System.out.println("Running from the enemy");
//    }
//    public void fire (){
//        System.out.println("Firing on the enemy");
//    }
//}
//     question 6
class Circle{
    int Pay;
    int R;
    public int Perimeter(){
        return 2*Pay*R;
    }
    public int Area(){
        return Pay*R*R;
    }
}
  public class CWH_29_PS_8 {
      public static void main(String[] args) {
//    question 1
//    public static void main(String[] args) {
//        Employee1 raj = new Employee1();
//        raj.setName("codeWithHarry");
//        raj.salary = 465;
//        System.out.println(raj.getSalary());
//        System.out.println(raj.getName());
////        aditya.setName("Code with harry");
//}
//}
//    question 2
//public static void main(String[] args) {
//    CellPhone asus = new CellPhone()
//          asus.callFriend();
//          asus.vibrate();
//          asus.ring();
//    }
// question 3
//          Square aditya = new Square();
//          aditya.side = 3;
//          System.out.println(aditya.ares());
//          System.out.println(aditya.perimeter());

//      question 4
//          Rectangle Sq = new Rectangle();
//          Sq.Length = 4;
//          Sq.Width = 6;
//          System.out.println(Sq.area());
//          System.out.println(Sq.perimeter());
//        question 5
//          Tommy T = new Tommy();
//          T.fire();
//          T.hit();
//          T.run();
//          question 5
          Circle O = new Circle();
          O.Pay = 5;
          O.R = 6;
          System.out.println(O.Pay);
          System.out.println(O.R);
      }
}

