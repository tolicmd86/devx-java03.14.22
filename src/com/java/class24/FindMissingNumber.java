package com.java.class24;

public class FindMissingNumber {
    public static void main(String[] args) {
        //Write a program to find missing number
        // from an array of 1 to 10
        int data[]={1,2,3,4,5,6,7,9,10};

        int missingNum=0;
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        for (int num:data){
            missingNum=missingNum+num;

        }
        System.out.println(sum-missingNum);
    }
}
