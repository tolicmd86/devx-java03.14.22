package com.java.class13;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // create three variable with consatnat value
        // take third variable value from user using Scanner class
        // Compare 1st and 2nd using ==operator
        // Compare 2nd and 3rd using==operator
        // compare 1st and 3rd using . equals() method

        Scanner sc= new Scanner(System.in);

        String word1= "Tony";
        String word2 ="Tony";
        //String word3 = new String("Tony");//or
        String word3 = sc.nextLine();

        if(word1==word2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(word2==word3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(word1.equals(word3)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }







    }
}
