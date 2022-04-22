package com.java.class18;

public class HomeWorkMethods5DivisorOrDivisibleBy6 {
    public static void main(String[] args) {
        // Write a program to print all numbers from 1 to 50 which has more than 5 divisor
        // Write a program to print all even numbers which are divisible by 6 from 1 to 50
        for(int i=1; i<=50; i++){
            if(more5divisor(i)==true){
                System.out.println(i+":it has more than 5 divisors");
                printLine(40,'=');
            }
            if(isDivisibleBy6(i)==true){
                System.out.println(i+ ":it's divisible by 6");
                printLine(40,'-');
            }
        }


    }


    static boolean more5divisor(int num){
        int count=0;

        for(int i=1; i<=num ; i++){

            if(num%i==0){
                count++;
            }
        }
        if(count>5){
            return true;
        }else{
            return false;
        }
    }


    static boolean isDivisibleBy6(int num){
        if(num%6==0){
            return true;
        }else{
            return false;
        }

    }

    static void printLine(int length,char c){
        for(int i=1;i<=length;i++){
            System.out.print(c);
        }
        System.out.println();
    }
}





