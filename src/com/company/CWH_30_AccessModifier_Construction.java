package com.company;
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int I){
        id = I;
    }
}
public class CWH_30_AccessModifier_Construction {
    public static void main(String[] args) {
        MyEmployee adi = new MyEmployee();
        adi.setName("Code with harry");
        System.out.println(adi.getName());
        adi.setId(44443);
        System.out.println(adi.getId());
    }
}
