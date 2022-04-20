package com.java.class16;

public class FindOccurenceOfChar {

    public static void main(String[] args) {

        //Write a progrma to take one String from user and print
        //occurence of given char in String

        String str = "This is my java program";

        char c = 'a';
      int count= 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }

        System.out.println(count);





    }
}
