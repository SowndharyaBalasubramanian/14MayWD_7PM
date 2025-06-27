package com.Stringg;

public class StringBuffer_Ex {
    public static void main(String[] args){

        StringBuffer sbr = new StringBuffer("Besant");
        sbr.append(" is a training institute");
        System.out.println(sbr);

        //not safe for multithreading scenarios
    }

}
