package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        //3. Write a program to take number from user and check if it's divisible by 5 or 3
        System.out.println("Enter your number");
        Scanner sc= new Scanner(System.in);
         int num= sc.nextInt();

//         if (num%5==0){
//             System.out.println(num+ " it's divisible by 5");
//         }else if (num%3==0){
//             System.out.println(num+ " it's divisible by 3");
//         }else{
//             System.out.println("Enter your number");
//         }

        if (num%5==0 || num%3==0) {
            System.out.println(num + " it's divisible by 5 or 3");
        }else{
            System.out.println(num+ " it's not divisible by 3 or 5");
        }

    }
}
