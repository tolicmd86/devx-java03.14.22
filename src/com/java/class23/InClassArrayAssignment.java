package com.java.class23;
 // Create array of 5 integers and print all numbers from array
public class InClassArrayAssignment {
    public static void main(String[] args) {

        int data[] = {3, 4, 5, 6, 7};

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
           int listofData[];
       listofData= new int[6];
       listofData[0]=10;
       listofData[1]=20;
       listofData[2]=30;
       listofData[3]=40;
       listofData[4]=50;
       listofData[5]=60;
       for (int i=0;i<listofData.length;i++){
           System.out.println("data["+i+"]="+ listofData[i]);
       }

    }

}
