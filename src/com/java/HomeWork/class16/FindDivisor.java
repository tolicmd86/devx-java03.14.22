package com.java.HomeWork.class16;

import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        //Find divisor of given number (Input - 6, output will be 1 2 3 6)

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

}
