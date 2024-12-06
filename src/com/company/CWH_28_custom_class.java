package com.company;

class Employee{      // custorm class name as emplayee
    int id;
    String name;
    int age;
    public void printDetails(){
        System.out.println("My ID is "+ id);
        System.out.println("my name is "+ name);
        System.out.println("my age is "+ age);
    }

    public void setName(String codeWithHarry) {
    }
}
public class CWH_28_custom_class {
    public static void main(String[] args) {
        System.out.println("This is ower custome class in oop's consept");

//        instantiation a new Employee Object
        Employee aditya = new Employee();
        Employee nagothakar = new Employee();

//        Setting Attributes
        aditya.id = 12;
        aditya.age = 78;
        aditya.name = "Aditya";

        nagothakar.id = 545;
        nagothakar.age = 34;
        nagothakar.name = "Nagothakar Pakya";

//        Printing the attributes
        aditya.printDetails();
        nagothakar.printDetails();
    }
}
