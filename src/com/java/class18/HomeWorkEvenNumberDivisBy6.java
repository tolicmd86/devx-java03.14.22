package com.java.class18;

public class HomeWorkEvenNumberDivisBy6 {
   // Write a program to print all even numbers which are divisible by 6 from 1 to 50

    public static void main(String[] args) {

       for(int i=1 ; i<=50;i++){
           if(i%6==0){
               System.out.println(i+ ":is divisible by 6");
               printLine(30,'=');
           }else {

               System.out.println(i+ ":is not divisible by 6");
              printLine(30,'=');
           }
       }


    }
    static void printLine(int length, char c){
        for(int i=1;i<=length;i++){
            System.out.print(c);
        }
        System.out.println();
    }


}
