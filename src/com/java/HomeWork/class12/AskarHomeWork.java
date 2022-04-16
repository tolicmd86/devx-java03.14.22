package com.java.HomeWork.class12;

import java.util.Scanner;

public class AskarHomeWork {
    public static void main(String[] args) {

//        Palindrome: Write it on remote server in your folder.
//        it's  a word that is read the same from beginning on end.
//        ex: kayak, racecar, mom, dad.
//                write a program where users enters any String.
//                and your program prints Polindrome if the given String is a palindrome.
//        or it prints out not Palindrome if it's not Palindrome

        //need to take an inout from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word ");
        String str = sc.nextLine().toLowerCase();

        //we need to compare word to word backwards"word"=="drow"

        
        //we need to invert our original word
        String str1 = ""; //inverted string

        for (int i = str.length() - 1; i >= 0; i--) {
            str1=str1+str.charAt(i);
            System.out.println(str1);

        }

        if (str.equals(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1+ " is not a palindrome.");


        }





    }
}