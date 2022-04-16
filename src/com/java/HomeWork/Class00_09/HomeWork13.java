package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork13 {

    public static void main(String[] args) {
//        2.  Write a program to get T-shirt size in inches and print size based on inches
//        If inches is 27 to 30 Print XS
//        If inches is 31 to 34 Print S
//        If inches is 35 to 38 Print L
//        If inches is 39 to 42 Print XL
//        If inches is 45 to 50 Print XXL

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you size");

        int inch= sc.nextInt();
        if(inch>=27 && inch<=30){
            System.out.println(inch+" Your size is Xs");
        }else if (inch>=31 && inch<=34){
            System.out.println(inch+" your size is S");
        }else if (inch>=35 && inch<=38){
            System.out.println(inch+" your size is L");
        }else if(inch>=39 && inch<=42){
            System.out.println(inch+" your size is XL");
        }else if(inch>=45 && inch<=50){
            System.out.println(inch+" your size is XXL");
        }else {
            System.out.println("Enter your size");
        }




    }
}
