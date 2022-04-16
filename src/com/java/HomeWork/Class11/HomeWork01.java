package com.java.HomeWork.Class11;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

       // 1. Write a program to print table of given number. If user enters 3 then print table of 3 like below

      //  3 6 9 12 15 18 21 24 27 30

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i=1;


        while(i<=num){
            System.out.println(i*3);
            i++;
        }





    }




}
