package com.java.class23;

public class HomeWorkAverageOfArray {
    public static void main(String[] args) {

        //  Write a program to Calculate the Average of Array Elements (Example input - 5, 6, 4, 3, 2    Output - 4.0)

        int numb[]={5,6,4,3,2};

        double average=0;


        for (int i=0;i<numb.length;i++){
            average=average+numb[i];
        }
        System.out.println(average/numb.length);



    }
}
