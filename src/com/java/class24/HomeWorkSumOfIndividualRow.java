package com.java.class24;

public class HomeWorkSumOfIndividualRow {
    public static void main(String[] args) {
        // Find sum of Individual row in 2D array
        //Example input:
        //3 4 6
        //7 6 4
        //9 9 2
        //Output :
        //Sum of  row1 = 13
        //Sum of  row2 = 17
        //Sum of row3 = 20

        int data[][]={{3,4,6}, {7,6,4}, {9,9,2}};



        for (int i=0; i<data.length;i++) {
            int sum=0;
            for (int j = 0; j < data[i].length; j++) {

                sum =sum+data[i][j];

            }
            System.out.println("row "+(i+1)+" sum: "+ sum);

        }
















    }

}
