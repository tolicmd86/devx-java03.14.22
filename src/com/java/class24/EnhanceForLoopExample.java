package com.java.class24;

public class EnhanceForLoopExample {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67};

        System.out.println(getMaximum(data));
        System.out.println(getIndexOfNumber(data, 674));
    }

    static int getAvgOfNumber(int data[]) {
        int sum=0;
        for (int datum : data) {
            sum = sum + datum;
        }
        return sum/data.length;
    }

    static int getSumOfNumber(int data[]) {
        int sum=0;
        for (int datum : data) {
            sum = sum + datum;
        }
        return sum;
    }

    static int getIndexOfNumber(int data[], int num) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == num) {
                return i;
            }
        }
        return -1;
    }

    static int getMaximum(int data[]) {
        int max = data[0];

        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }

        return max;
    }

}
