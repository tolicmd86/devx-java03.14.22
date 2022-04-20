package com.java.class16;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        //Write a program to check given number is prime number or not

        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

//        if(num%2!=0&& num>1|| num==2){
//            System.out.println(num+":is prime num");
//        }else{
//            System.out.println(num+":is not prime num");
//        }

        // using add++ method
//        int add = 0;
//        for(int i=1;i<=num;i++){
//            if(num%i==0){
//                add++;
//            }
//        }
//
//        if(add==2){
//            System.out.println(num+":is prime number");
//        }else{
//            System.out.println(num+":is not prime number");
//        }


       // with boolean method
        boolean isPrime= true;
        for(int i=1;i<num;i++){
            System.out.println("We are dividing "+num+" with "+i);
            if(num%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println("prime number");
        }else
            System.out.println("not prime");
    }

}
