package com.company;
class MyMainEmployee{
    private int Id;
    private String name;

//    We can many as many form of construction 

//    public MyMainEmployee(){                  There are two steps in this    Form 1
//        Id = 54;
//        name = "Aditya";
//
//    }
public MyMainEmployee(int MyId, String MyName){          // Form 2
    Id = 54;
    name = "Aditya";

}
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int gatId(){
        return Id;
    }
    public void setId(int I){
        Id = I;
    }
}
public class CWH_31_Constructors {
    public static void main(String[] args) {
//        MyMainEmployee M = new MyMainEmployee();    Form 1
        MyMainEmployee M = new MyMainEmployee(323, "Aditya P Nagothakar");     // Form 2
        System.out.println(M.gatId());
        System.out.println(M.getName());
    }
}
