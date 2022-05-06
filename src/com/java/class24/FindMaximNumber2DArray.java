package com.java.class24;

public class FindMaximNumber2DArray {

    public static void main(String[] args) {
        int data[][]={{100, 13, 3},{24,51,36},{70,28,59}};

        for(int i=0;i< data.length;i++){
            int max=0;

            for(int j=0;j<data[i].length;j++){
                if(data[i][j]>max){
                    max=data[i][j];
                }

            }
            System.out.println("row "+(i+1)+"max:"+max);

        }
        System.out.println();
        int data1[][]={{100, 13, 3},{-24,-51,-36},{70,28,59}};

        for(int i=0;i< data1.length;i++){
            int max=data1[i][0];

            for(int j=0;j<data1[i].length;j++){
                if(data1[i][j]>max){
                    max=data1[i][j];
                }

            }
            System.out.println("row "+(i+1)+"max:"+max);

        }
        System.out.println();

        int data2[][] = {{-100, -13, -3}, {-24, -51, -36}, {70, 28, 59}};


        for (int i = 0; i < data2.length; i++) {
            // initialize first number from each row as max
          int max = data2[i][0];

            //In this for loop check if we have any number
            // which is greater than our max number
            for(int j=0; j<data2[i].length; j++){

                if(data2[i][j] > max){
                    max = data2[i][j];
                }
            }

            // print max from each row
            System.out.println(max);
        }

    }
}
