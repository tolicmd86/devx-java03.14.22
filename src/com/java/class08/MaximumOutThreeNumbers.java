package com.java.class08;

import java.util.Scanner;

// Take three numbers from user and print max number out of numbers


public class MaximumOutThreeNumbers {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number");
         int num1= sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Number three");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1+" this is the maximum number " );
        }else if(num2>num3){
            System.out.println(num2 +" this is the maximum number ");
        }else{
            System.out.println(num3+" this is the maximum number ");
        }
       // aici ceva nui corect
     //        Scanner sc= new Scanner(System.in);
       //        System.out.println("enter your first number");
     //        int num1= sc.nextInt();
     //        System.out.println("Enter your second number");
     //        int num2 = sc.nextInt();
    //        System.out.println("Enter Number three");
    //        int num3 = sc.nextInt();
    //
    //        if(num1==num2 && num1==num3){
     //            System.out.println(num1+" this is the maximum number " );
     //        }else if(num2==num3){
     //            System.out.println(num2 +" this is the maximum number ");
     //        }else{
     //            System.out.println(num3+" this is the maximum number ");
       // }

    }




}
