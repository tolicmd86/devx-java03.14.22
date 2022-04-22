package com.java.class18;

public class HomeWork5Divisor {
   // Write a program to print all numbers from 1 to 50 which has more than 5 divisor
   public static void main(String[] args) {



      for(int i=1;i<=50;i++){
          int count=0;
         for(int num=1 ; num<=i ;num++){

              if(i%num==0){
                 count++;
              }
           }
           if(count>5){
              System.out.println(i+":it has more than 5 divisor");
           }


      }
   }
}
