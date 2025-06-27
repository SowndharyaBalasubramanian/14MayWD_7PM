package com.strng;

public class StringBuilder_Ex{
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Besant");
        sb.append(" is a training institute");
        System.out.println(sb);

        //not safe for multithreading scenarios
    }

}
