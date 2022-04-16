package com.java.class04;

public class ComparisonOperatorExample {

    public static void main(String[] args) {

        int num=10, num2=12, num3=10, num4=8;
//       In java for multiple comments line we have to use /*..*/ or
//         we can select the text we want to have it as a coment and press (comand+/)for mac users, to uncomment the
//        procedure.
        //
        System.out.println(num==num2);//false
        System.out.println(num<num2);//true
        System.out.println(num>num2);//false
        System.out.println(num<num3);//false
        System.out.println(num>=num3);//true
        System.out.println(num<num4);//false
        System.out.println(num3>=num);//true
        System.out.println(num2>num4);//true
        System.out.println(num4>num3);//false
        System.out.println(num3<=num4);//false
        System.out.println(num == num2); // false
        System.out.println(num < num2);  // true
        System.out.println(num > num2);  // false
        System.out.println(num < num3);  // false
        System.out.println(num >= num3); // true
        System.out.println(num <= num2); // true
        System.out.println(num <= num3); // true
        System.out.println(num != num2); // true
        System.out.println(num2 <= num3); // false
        System.out.println(num2 >= num4); // true
        System.out.println(num != num3); // false




    }




}

