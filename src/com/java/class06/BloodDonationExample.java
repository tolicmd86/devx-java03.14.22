package com.java.class06;


import java.util.Scanner;

public class BloodDonationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inputs
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Enter your Weight");
        int weight = sc.nextInt();

        if(age >=18) {
            System.out.println("Age" + age + " It's eligible");
            if (weight >= 54) {
                System.out.println("Weight" + weight + " It's eligible");
            } else {
                System.out.println("Weight" + weight + " It's not eligible");
            }
        }else {

                System.out.println("Age" + age + " It's not eligible");
            }
        }






    }









