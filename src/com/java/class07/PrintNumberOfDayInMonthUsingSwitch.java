package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {

    public static void main(String[] args) {
        System.out.println("Please enter a month : ");
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();

        switch (month) {
            case "January":
            System.out.println("January has 31 days");
            break;
            case "February":
                System.out.println("February has 28 days");
                break;
            case "March":
                System.out.println("March has 31 days");
                break;
            case "April":
                System.out.println("April has 30 days");
                break;
            case "May":
                System.out.println("May has 31 Days");
                break;
            case "June":
                System.out.println("June has 30 Days");
                break;
            case "July":
                System.out.println("July has 31 Days");
                break;
            case "August":
                System.out.println("August has 31 Days");
                break;
            case "September":
                System.out.println("September has 30 Days");
                break;
            case "October":
                System.out.println("October has 31 Days");
                break;
            case "November":
                System.out.println("November has 30 Days");
                break;
            case "December":
                System.out.println("December has 31  Days");
                break;
            default:
                System.out.println("Please Enter a Month");



        }









    }









}
