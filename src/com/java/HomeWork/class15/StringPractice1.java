package com.java.HomeWork.class15;

public class StringPractice1 {
    public static void main(String[] args) {

       // how to remove a char without charAt method,using the substring method
        String str = "Anatolie";
        int n =2;

        String str1 = str.substring(0,n);
      String str2 = str.substring(n+1,str.length());
        System.out.println(str1+str2);
    }

}
