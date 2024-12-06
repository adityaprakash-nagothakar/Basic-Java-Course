package com.company;

class base{
    int x;

    public int getX() {
        System.out.println("Nauthing");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derive extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_34_Inheritance {
    public static void main(String[] args) {
        base B = new base();
        B.setX(56);
        System.out.println(B.getX());

        derive D = new derive();
        D.setY(4);
        System.out.println(D.getY());
        D.setX(45);
        System.out.println(D.getX());

    }
}
