package com.operations;

public class Logical_Operators {

    public static void main(String[] args){

        //and operator
//        int num1 = 6; int num2 = 7;
//        System.out.println((num1 > 5) && (num2 <9));
//        System.out.println((num1 < 5) && (num2 > 9));
//        System.out.println((num1 < 5) && (num2 <9));        // false && true         false
//        System.out.println((num1 > 5) && (num2 > 9));        //true && false         false


        //OR operator (||
        int num1 = 6; int num2 = 7;
//        System.out.println((num1 > 5) || (num2 <9));    // true || true      true
//        System.out.println((num1 < 5) || (num2 > 9));   // false || false    false
//        System.out.println((num1 < 5) || (num2 <9));    // false || true         true
//        System.out.println((num1 > 5) || (num2 > 9));    //true || false      true

        System.out.println(!(num1 < 14));    // true        // false

    }
}
