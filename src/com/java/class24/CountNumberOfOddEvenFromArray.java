package com.java.class24;

public class CountNumberOfOddEvenFromArray {
    public static void main(String[] args) {

        int data[]={34,6,7,23,8,90,35,76};
        int countEven=0;
        int countOdd=0;
        for(int i=0;i< data.length;i++){
            if(data[i]%2==0) {
                countEven++;

            }else{
                countOdd++;
            }


        }

        System.out.println(countEven+":even numbers");
        System.out.println(countOdd+":Odd numbers");


    }
}
