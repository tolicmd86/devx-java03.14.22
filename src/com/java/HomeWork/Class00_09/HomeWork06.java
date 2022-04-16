package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork06 {

    //write a program to check given number is positive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();

        if(num1>0) {
            System.out.println("Positive");
        }else if(num1<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
    }







}
