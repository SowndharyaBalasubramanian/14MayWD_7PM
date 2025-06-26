package com.operations;

public class Bitwise_Operators {
    public static void main(String[] args){
        //and operation

        int a = 14;
        int b = 6;
        System.out.println(a & b);

        //or operator
        System.out.println(a | b);

        //exclusively OR  (XOR)
        System.out.println(a^b);

        System.out.println(~a);

        int c = 4;
        System.out.println(~c);
        System.out.println("Binary digits : " + Integer.toBinaryString(~c));

        //- (14+1) = -15

        //shift operator

        //left shift

        System.out.println(a << 1);
        System.out.println(a << 3);

        int d = -4;



    }
}


