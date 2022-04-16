package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
//        Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
//        If marks are from 90 to 100 Print A
//        If marks are from 80 to 89 Print B
//        If marks are from 70 to 79 Print C
//        If marks are from 60 to 69 Print D
//        If marks are from 50 to 59 Print E
//        If marks are from 0 to 49 Print Fail

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
         int marks = sc.nextInt();

         if(marks>=90 && marks<=100){
             System.out.println(" A");
         }else if(marks>=80 && marks<=89 ){
             System.out.println(" B");
         }else if (marks>=70 && marks<=79){
             System.out.println(" C");
         }else if(marks>=60 && marks <=69){
             System.out.println(" D");
         }else if(marks>=50 && marks<=59){
             System.out.println(" E");
         }else if(marks>=0 && marks<=49){
             System.out.println(" Fail");
         }else {
             System.out.println("Enter your marks");
         }
















    }
}
