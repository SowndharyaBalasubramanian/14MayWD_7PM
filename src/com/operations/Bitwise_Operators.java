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
        System.out.println(-c);

        //- (14+1) = -15 => ~c
        //-c = ~c+1


        //shift operator

        //left shift

        System.out.println(a << 1);
        System.out.println(a << 3);

        int d = -4;
        System.out.println(d << 2);

//right

        //signed

        int e = 6;
        System.out.println(e >> 1);
        System.out.println(e >> 2);

        int f = -6;
        System.out.println( f >> 1);
        System.out.println(f >> 2);

        //unsigned

        int g = 6;
        System.out.println(g >>> 1);
        System.out.println( g >>> 2);

        int h = -6;
        System.out.println(h >>> 1);
      System.out.println( h >>> 2);
    }
}


