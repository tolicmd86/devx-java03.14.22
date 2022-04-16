package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork10 {

   /* 2. Write a program to check given character is Vowel or Not
    Vowel characters are - 'a','e','i','o','u'
            (If you're not using scanner class it's fine you can directly take char value in program)*/

    public static void main(String[] args) {

        System.out.println(" Enter your character ");
        Scanner sc = new Scanner(System.in);
        String  letters = sc.nextLine();

        switch (letters){
            case "a":
            case "e":
            case"i":
            case"o":
            case"u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not vowel");
        }

            /*  char j='e';
              if(j=='a'|| j=='e'|| j=='i'|| j=='o'||j =='u'){
                  System.out.println("Vowel");
              }else{
                  System.out.println("not vowel");
              }*/











    }









}
