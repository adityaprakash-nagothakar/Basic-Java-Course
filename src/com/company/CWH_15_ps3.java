package com.company;

public class CWH_15_ps3 {
    public static void main(String[] args){
        String name = "Aditya Nagothakar";
        name = name.toUpperCase();
        System.out.println(name);


        //dbvrgbrtb
        String text = "Aditya\n\t   P   \nNagothakar";
        text = text.replace(" ", "_");
        System.out.println(text);



        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Aditya");
        System.out.println(letter);



        String myString = "This string contain double and triple  space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf(" "));



        String myLetter = "Dear Aditya,\n\t this java course is Nice.\n   Thanks a Lot!";
        System.out.println(myLetter);





    }
}

