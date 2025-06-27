package com.Stringg;

public class StringBuilder_Ex {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Good");
        sb.append(" Evening");
        System.out.println(sb);

        //not safe for multithreading scenarios
    }

}
