package com.java.class07;

public class RevisionQ5 {
    public static void main(String[] args) {

   int a = 19;

       if(a%10*2>10){
           System.out.println("1");//1 pentru ca e true si nu se mai duce la else if
       }else if(a%10-4==5){
           System.out.println("2");
       }

       if (a*2>30){
           System.out.println("3");//3  si a executat si acest if statement pentru ca if este alta conditie
       }else{
           System.out.println("4");
       }




    }
}
