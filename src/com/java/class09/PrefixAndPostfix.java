package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {

        //int i =5;

        //int j=++i; // int j = i++;

        //int i= 1;
       // int j= 4;

//        i++;
//        i++;
//        int k = i +j;

       // int k = i++ + ++j;
        int i =4;
        int j = 4;
       // int k = 0;
       // int m= 0;
        int k = i++ +--j;
        int m= k++ - i++;

        System.out.println(i);

        System.out.println(j);

        System.out.println(k);

        System.out.println(m);







    }
}
