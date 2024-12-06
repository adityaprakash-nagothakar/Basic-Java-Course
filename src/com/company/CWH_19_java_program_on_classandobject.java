package com.company;

import java.io.*;
import javax.xml.crypto.Data;
import java.io.DataInput;

public class CWH_19_java_program_on_classandobject {

    static class Student {
        int rollno;
        String name;

        void insertdata(int r, String n) {
            rollno=r;
            name=n;

        }

        void getdata()throws Exception

        {
            DataInputStream R1 = new DataInputStream(System.in);
            System.out.println("enter roll no");
            try {
                rollno=Integer.parseInt(R1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("name");
            name=R1.readLine();

        }

        void displayInformation() {
            System.out.println(rollno + " " + name);
        }
    }
    class studentmain
    {
        public static void main(String args[]) throws Exception {
            Student s1;
            s1 = new Student();
            Student s2;
            s2=new Student();
            s1.insertdata(1, "sachin");
            s2.getdata();
            s1.displayInformation();
            s2.displayInformation();
        }
    }
}