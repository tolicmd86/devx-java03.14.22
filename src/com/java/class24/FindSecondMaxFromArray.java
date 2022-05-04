package com.java.class24;

public class FindSecondMaxFromArray {
    public static void main(String[] args) {
        //write a program to find Second Max from an Array

        int data[] = {35, 33, 75, 43, 23, 67};
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];

            } else if (data[i] > secMax) {
                secMax = data[i];
            }


        }
        System.out.println(secMax);
    }


}
