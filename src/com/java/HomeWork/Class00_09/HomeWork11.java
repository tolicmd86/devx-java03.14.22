package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork11 {
  /*   3. Write a program to take username and password from user and print appropriate message
    based on below conditions
	1. If username correct and password correct ---> Login successful
	2. If username correct and password incorrect --> Invalid password
	3. If username incorrect and password correct --> Invalid username
	2. If username incorrect and password incorrect --> Login unsuccessful
    */
  public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("please enter your username");
      String userName = sc.nextLine();
      System.out.println("please enter your password");
      String password = sc.nextLine();

      if (userName.equals("tony") && password.equals("12345")){
          System.out.println("Login Successful");
      }else if (userName.equals("tony")){
          System.out.println("Invalid Password");
      }else if ( password.equals("12345")){
          System.out.println("Invalid Username");
      }
      else {
          System.out.println("login unsuccessful");
      }

  }






}
