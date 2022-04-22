package com.java.class18;

import java.util.Scanner;

public class MethodsCheckPalindrome {

    static void isPalindrome(String str){
        String rev = ""; //inverted string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev=rev+str.charAt(i);


        }

        if (rev.equals(str)) {
            System.out.println(rev + " is a palindrome.");
        } else {
            System.out.println(rev + " is not a palindrome.");

        }
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Word");
         String str= sc.next();
         isPalindrome(str);



    }
}



