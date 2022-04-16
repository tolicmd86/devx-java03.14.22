package com.java.class08;

public class TypeCasting {
    public static void main(String[] args) {

        // Type Conversion - Int to Double
        // Widening type casting
        // Implicit type casting = java will do itself without error
        int a= 10;
        double d=a;
        System.out.println(d);

        // Type Conversion Double to Int
        // Narrowing type casting
        // Explicit Type Casting = User has to put target data type in bracket

        double dd=10.9;
        // int aa=dd; //nu o sa printeze pentru ca double nu poate sa stocheze in int pentru ca double este mai mare
        int aa=(int)dd;
        System.out.println(d);



    }
}
