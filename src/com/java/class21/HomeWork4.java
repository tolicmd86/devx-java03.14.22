package com.java.class21;

public class HomeWork4 {
    public static void main(String[] args) {

        System.out.println("===============Pattern 4 ================ ");
        for(int i=1;i<=5;i++){

            for(int k=1;k<=i;k++){

                    System.out.print(2*i-1);

            }
            System.out.println();
        }
        System.out.println("===============Pattern 4 ================ ");
        for (int i = 1; i <= 9; i = i + 2) {

            for (int k = 1; k <= i; k = k + 2) {

                System.out.print(i);


            }
            System.out.println();
        }


        System.out.println("===============Pattern 4 ================ ");
        int n=1;
        for(int i=1;i<=5;i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print(n);

            }
            n = n + 2;
            System.out.println();

        }
    }
}
