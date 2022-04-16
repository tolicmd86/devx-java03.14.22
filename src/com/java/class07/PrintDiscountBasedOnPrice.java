package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {

    public static void main(String[] args) {

        System.out.println("Please enter a num ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num<100)  {
            System.out.println(num + " No Discount");

        }else if (num<500) {
            System.out.println(num + " 5%");
        }else if(num<100) {
            System.out.println(num + "10%");
        }else if(num<=1000) {
            System.out.println(num + " 15%");
        }






        }









    }









