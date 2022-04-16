package com.java.class11;

import java.util.Scanner;

public class InClassWhileLoopExample {

    public static void main(String[] args) {

        //Write a program to get 1 2 * 4 5 *7 8 * 10
      //  we are using the if condition

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter how many number you want");
        int limit= sc.nextInt();


        int i=1;

        while(i<=limit) {
            if (i % 3 == 0){
                System.out.println("*");
        }else {
                System.out.println(i);
            }
            i++;

        }






    }








}
