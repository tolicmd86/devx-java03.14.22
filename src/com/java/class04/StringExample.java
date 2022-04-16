package com.java.class04;

public class StringExample {
    // If we do addition with String it'll be concatenation
    // String + String = StringString (concatenation)
    // String + Int = StringInt (concatenation)
    // Int + String = IntString (concatenation)
    // Int + Int = Int (addition)

    public static void main(String[] args) {
        int a=10, b =20, c=30;
        String str="Hello";
        String str1= "Java";
        System.out.println(a);//10
        System.out.println(str);//Hello
        System.out.println(str+str1);//HelloJava
        System.out.println(str +" " +str1);// cu spatiu intre cuvinte folosim aceste double quotation
        System.out.println(str1+a);//Java10
        System.out.println(str1+ a+ b);//Java1020
        System.out.println(a+b);//30
        System.out.println(a+b+str);//cind facem int+int+String se calculeaza prima intinger
        System.out.println("a+b");// nu se aduan cind le folosesti in db marks
        System.out.println("a"+b);//a20(a is a string and b is variable of type int)
        System.out.println("a"+b+c);//a2030(a is a string and b is variable of type int)

        System.out.println(str+a*b);//Hello200 (multiplication first)
       // System.out.println(str+a-b);//error because only( + )is working in concatenation
        System.out.println(a-b+str);//-10Hello because we have int first





    }



}
