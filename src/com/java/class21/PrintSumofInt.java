package com.java.class21;

public class PrintSumofInt {
    public static void main(String[] args) {

        int num=325;
        // output 10
        int sum=0;
        while(num>0){

            sum=sum+num%10;
            num=num/10;

        }
        System.out.println(sum);
    }
}
