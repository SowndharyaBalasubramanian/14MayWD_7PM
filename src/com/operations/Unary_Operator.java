package com.operations;

public class Unary_Operator {

    public static void main(String[] args){

        int s = 3;
        //increment
       System.out.println(s++);   // 3 ia printed    4 = java memory
       // System.out.println(s);
       System.out.println(++s);//4 + 1 = 5


       int r = 7;
        System.out.println(--r);      //7-1 = 6  r =6
        System.out.println(r--);      //6        6-1 =5 (java memory)
        System.out.println(r);
    }
}
