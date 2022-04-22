package com.java.class17;

public class PrimeNumbers1To50 {

    public static void main(String[] args) {

        // 1. we need to print all prime numbers form 1 to 50
        // 2. a prime number is a number divisible by 1 and itself
        // 3. prime numbers  are odd numbers, 2 is the only even number considered prime number
        // so we have to start from int i=2
        // 4. We have to use for loop method to print the numbers from 1 to 50

//        for (int i =2;i<=50;i++){
//
//            boolean isPrime=true;
//            //5
//            for(int a=2;a<i;a++){
//                if(i%a==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println(i+":is Prime");
//            }

        int count = 0;
              for(int i=2;i<=50;i++){

        for(int num=1;num<=i;num++){

            if(i%num==0){
                count++;
            }
        }

        if(count==2){
            System.out.println(i+":is prime number");
        }


        }



    }
}
