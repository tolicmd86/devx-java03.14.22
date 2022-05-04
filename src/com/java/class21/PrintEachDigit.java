package com.java.class21;

public class PrintEachDigit {
    //Write a program to print each digit of number into each line
    //output 3 4 3 5 2

    public static void main(String[] args) {
        int num=25343;

        while(num>0){
            //retrieve last digit from number
            System.out.println(num%10);
            num=num/10;
        }

    }
}
