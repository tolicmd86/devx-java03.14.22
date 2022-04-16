package com.java.class11;

import java.util.Scanner;

public class BrainStormingWhileLoopExample {
    public static void main(String[] args) {


        //Write a program to print below numbers
        //6 12 18 24 30 36 42 48 54 60

//        int i = 1;
//
//        while(i<=10){
//            System.out.println(6*i);
//            i++;
//
//        }

          // with Scanner class

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter how many number you want");
          int num= sc.nextInt();
          int i= sc.nextInt();

          while(i<=num){
              System.out.println(i*6);
              i++;
          }

    }
}
