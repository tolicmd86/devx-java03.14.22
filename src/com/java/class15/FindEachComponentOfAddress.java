package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {

        // Write a program to print each component of address into separate line
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";

        String[] str = address.split(",");
        System.out.println(address.length());

        for(int i=0;i<address.length();i++) {
            System.out.println(str[i].trim());// trim is for removing the spaces in the output
        }



    }


}
