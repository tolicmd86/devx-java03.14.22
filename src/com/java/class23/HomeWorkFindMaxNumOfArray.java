package com.java.class23;

public class HomeWorkFindMaxNumOfArray {

   // Write a program of Find maximum number from an array (Example input - 5, 6, 4, 3, 2    Output - 6) (edited)
   public static void main(String[] args) {


       int numb[]={5,6,4,3,2};

       int maxNum=0;
       for (int i=0;i<numb.length;i++) {
           if (numb[i] > maxNum) {
               maxNum = numb[i];
           }
       }
       System.out.println(maxNum);
   }
}
