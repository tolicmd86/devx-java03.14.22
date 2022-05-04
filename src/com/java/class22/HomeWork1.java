package com.java.class22;

public class HomeWork1 {
  /*  ============== Homework =======================
    Write a program to find maximum digit from the given number (Example input - 4346345, Output - 6)
    Write a program to Count Number of Digit (Example input - 4345, Output - 4)
    Write a program to Reverse number (Example input - 4345, Output - 5434)
    Write a program to Check Given number is Palindrome or not (Example input - 23532, Output - Yes)

*/

    public static void main(String[] args) {

      int num=4346345;
      int maxNum=0;

      while (num>0){
          System.out.println(num%10);
          num=num/10;


          }



    }
}
