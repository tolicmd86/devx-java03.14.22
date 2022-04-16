package com.java.HomeWork.Class09;

public class HomeWork03 {
    public static void main(String[] args) {

        int i = 4, j = 4, k = 4;

        i= j++;
        j= k++;
        k=--i;
        int m = i + j + k--;

        System.out.println(i);//3
        System.out.println(j);//4
        System.out.println(k);//2
        System.out.println(m);//10





    }
}
