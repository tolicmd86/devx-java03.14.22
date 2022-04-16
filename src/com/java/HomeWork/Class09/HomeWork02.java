package com.java.HomeWork.Class09;

public class HomeWork02 {
    public static void main(String[] args) {

        int i = 4, j = 4, k = 4;

        i = j++ + --k;
        int m = i + j + k;

        System.out.println(i);//7
        System.out.println(j);//5
        System.out.println(k);//3
        System.out.println(m);//15
    }
}
