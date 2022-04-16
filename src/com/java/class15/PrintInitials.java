package com.java.class15;

public class PrintInitials {
    public static void main(String[] args) {

        //Take full name from user and print initials of it

        String fullname = "Chirag B Khimani";

       // System.out.println(fullname.charAt(0)+"."+fullname.charAt(7)+"."+fullname.charAt(9));


        String [] str = fullname.split(" ");

        String firstName =str[0];
        String middleName =str[1];
        String lastName = str[2];
        System.out.println(firstName.charAt(0)+"." +middleName.charAt(0)+"."+lastName.charAt(0)+".");
    }
}
