package com.java.class14;

import java.util.Locale;

public class StringMethods {


    public static void main(String[] args) {

        String str1 = "Hello Word";
        String str2 = "hello Word";
        String str3 = "Hello Word! Welcome to Devx!";

        // 1.we want to check equality of two String
        System.out.println("1.Equality:" +str1.equals(str2));
        System.out.println("===================================");

        // 2.Check equality of two String ignoring case
        System.out.println("2.Equality ignoring case:" +str1.equalsIgnoreCase(str2));
        System.out.println("===================================");

        // 3. Check one String contains another String
        //Contains will check one string contains another string considering case-sensitive
        System.out.println("3.Contains:"+ str1.contains(str1));
        System.out.println("3.Contains:"+ str3.contains(str1));

          // If we want check one String contains another String ignoring case then we have to change
          // both String in same case and then check contains, so it'll check only content of both
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println("3.Contains:"+ str3LowerCase.contains(str2LowerCase));
        System.out.println("===================================");
        // 4.Changing the case of String

        System.out.println("4. Upper Case:" + str3.toUpperCase());
        System.out.println("4. Lower Case:" + str1.toLowerCase());
        System.out.println("===================================");

        // 5. Find Index of character.  for Index method the counting it's staring from 0..

        str1 = "Hello World";
        System.out.println("5. Index of Char:" + str1.indexOf('W'));
        System.out.println("5. Last Index of Char:" + str3.lastIndexOf('W'));
        System.out.println("===================================");

        // 6. Find index at char

        str1 = "Hello World";
        System.out.println("6. Index Of Char:"+str1.charAt(0));
        System.out.println("===================================");

        // 7. Length of String. the counting in length method it's starting from 1..
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx!";
        System.out.println("7. Length of String:"+ str1.length());
        System.out.println("7. Length of String:"+ str3.length());
        System.out.println("===================================");

        // 8. Length of String
        str1 = "          ";
        str3 = "";
        System.out.println("8. Empty:"+ str1.isEmpty());
        System.out.println("8. Empty:"+ str3.isEmpty());
        System.out.println("8. Empty:"+ str1.isBlank());
        System.out.println("8. Empty:"+ str3.isBlank());
        System.out.println("===================================");


        // 9. Replace & ReplaceAll
        str1 = "Welcome User";
        str3 = "Devx";
        System.out.println("9.Replace:"+str1.replace("User",str3));
        str1 ="INR 200 INR 300 INR 500";
        str3 = "Devx";
        System.out.println("9.Replace:"+str1.replace("INR", "USD"));
        System.out.println("===================================");

        // 10.Format
        str1 = "Welcome %s";
        System.out.println("10.Format:"+ String.format(str1,"Tony"));
        System.out.println("===================================");


        // 11. SubString
        // 12. Split





    }
}
