package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork07 {

    //Write a program to take month from user and print number of days in given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month");
        int month = sc.nextInt();

        if(month ==1) {
            System.out.println(month + " -This month has 31 days");
        }else if(month ==2 ) {
            System.out.println(month + " -This month has 28 days");
        }else if(month == 3) {
            System.out.println(month + " -This month has 31 days");
        }else if(month == 4) {
            System.out.println(month + " -This month has 30 days");
        }else if(month == 5) {
            System.out.println(month + " -This month has 31 days");
        }else if(month == 6) {
            System.out.println(month + " -This month has 30 days");
        }else if(month == 7) {
            System.out.println(month + " -This month has 31 days");
        }else if(month == 8) {
            System.out.println(month + " -This month has 31 days");
        }else if(month == 9) {
            System.out.println(month + " -This month has 30 days");
        }else if(month == 10) {
            System.out.println(month + " -This month has 31 days");
        }else if(month == 11) {
            System.out.println(month + " -This month has 30 days");
        }else if(month == 12) {
            System.out.println(month + " -This month has 31 days");
        }else{
            System.out.println("This month doesn't exist");
        }




    }










}
