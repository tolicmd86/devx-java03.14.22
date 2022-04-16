package com.java.class15;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
      // write a program to print the 2nd half of String
        System.out.println("Enter any String");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length()%2==0){
            System.out.println(str.substring(str.length()/2));
        }else{
            System.out.println(str.substring(str.length()/2+1));
        }

          // System.out.println(str.substring(str.length()/2));// it will print the second half of the string
       // System.out.println(str.substring(str.length()/2+1));//




    }
}
