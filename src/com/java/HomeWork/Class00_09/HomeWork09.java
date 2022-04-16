package com.java.HomeWork.Class00_09;

import java.util.Scanner;

public class HomeWork09 {
   /* 1. Write a java program to Find Company name from the given product
    Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
    Possible Outputs = {google, facebook, microsoft}
2. Write a program to check given character is Vowel or Not
    Vowel characters are - 'a','e','i','o','u'
            (If you're not using scanner class it's fine you can directly take char value in program)
    3. Write a program to take username and password from user and print appropriate message
    based on below conditions
	1. If username correct and password correct ---> Login successful
	2. If username correct and password incorrect --> Invalid password
	3. If username incorrect and password correct --> Invalid username
	2. If username incorrect and password incorrect --> Login unsuccessful*/

    public static void main(String[] args) {
        System.out.println("Please enter a company ");
        Scanner sc = new Scanner(System.in);

        String company = sc.nextLine();

        switch (company){
            case "gmail":
            case "youtube":
                System.out.println("google");
                break;
            case "whatsapp":
                System.out.println("facebook");
                break;
            case"hangouts":
            case"skype":
            case"outlook":
                System.out.println("microsoft");
                break;
            default:
                System.out.println("Enter the company");
        }










    }











}
