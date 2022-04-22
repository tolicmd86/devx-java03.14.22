package com.java.class17;

public class MethodsPrimeNum1To50 {
    static boolean isPrime(int num){
        int add=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                add++;
            }
        }

        if (add == 2) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {

        for(int i=1;i<=50;i++){
            if(isPrime(i)==true){
                System.out.println(i+":is prime number");
            }
        }



    }







}
