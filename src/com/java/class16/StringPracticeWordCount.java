package com.java.class16;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        //Write a program to take one statement from user and find out number of words
        //we have inside the statement
        Scanner sc = new Scanner(System.in);

       String str= sc.nextLine();

        String[] parts = str.split(" ");
        System.out.println(parts.length);

    }
}
