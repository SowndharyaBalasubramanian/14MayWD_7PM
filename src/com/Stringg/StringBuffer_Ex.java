package com.Stringg;

public class StringBuffer_Ex {
    public static void main(String[] args){

        StringBuffer sbr = new StringBuffer("Besant");
        sbr.append(" is a training institute");
        System.out.println(sbr);

        sbr.insert(5 , "!");
        System.out.println(sbr);

        sbr.replace(9, 15, "java");
        System.out.println(sbr);

        sbr.delete(9 , 15);
        System.out.println(sbr);

        sbr.reverse();
        System.out.println(sbr);

        //not safe for multithreading scenarios
    }

}

//string < stringbuffer < stringbuilder
