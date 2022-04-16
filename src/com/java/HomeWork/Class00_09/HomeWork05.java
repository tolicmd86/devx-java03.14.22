package com.java.HomeWork.Class00_09;

 //Check Given Year Leap Year or Not


import java.util.Scanner;

public class HomeWork05 {

      public static void main(String[] args) {
            // Check Given Year Leap Year or Not
            System.out.println(" dear Tony please enter your year");
            Scanner sc = new Scanner(System.in);

            int year = sc.nextInt();

            if (year % 4 == 0) {
                  if(year % 100 == 0 && year % 400==0) {
                        System.out.println(year+" It's Leap Year");
                  }else if (year % 100 == 0 && year % 400!=0) {
                        System.out.println(year+" It's Not Leap Year");
                  }else {
                        System.out.println(year + " Also a leap Year");
                  }
            } else {
                  System.out.println(year+" It's not dividing by 4");
            }


      }


}