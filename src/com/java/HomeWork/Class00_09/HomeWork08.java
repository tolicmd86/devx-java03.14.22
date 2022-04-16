package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork08 {

    // Write a program to check if given number is divided by 5 or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
       // System.out.println(num % 5==0); // without if condition
       // with if condition
        if(num % 5==0){
            System.out.println(num+ " IT'S DIVIDED BY 5");
        }else{
            System.out.println(num+ " IT'S NOT DIVIDED BY 5");
        }







    }







}
