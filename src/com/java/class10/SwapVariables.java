package com.java.class10;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
       // int a=10, b =20;

        int c;
        c=a;
        a=b;
        b=c;

        // without using third variable, also it can be used with scanner class
       // a=a+b;
       // b=a-b;
      //  a=a-b;
        // another way using multiplication
        // a= a*b;
        // b=a/b;
        // a=a/b;
        System.out.println(a);
        System.out.println(b);



    }
}
