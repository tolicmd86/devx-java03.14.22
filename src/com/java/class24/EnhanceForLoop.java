package com.java.class24;

public class EnhanceForLoop {
    public static void main(String[] args) {

        int data[]={35,33,75,43,750,-100};

        for(int i:data){ // enhance for loop, we can do it this way to not write the i++ and data.length
            System.out.println(i);
        }

    }
}
