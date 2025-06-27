package com.Stringg;

public class Conversion_Ex {
    public static void main(String[] args) {

        //string -> stringbuffer
        String str = "Sowndharya";
        StringBuffer br = new StringBuffer(str);
        System.out.println("String : " + str);
        System.out.println("String Buffer : " + br);
//string -> stringbuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String : " + str);
        System.out.println("String Builder : " + sb);

        //Stringbuilder -> String
        StringBuilder sbr = new StringBuilder("Java");
        String course = sbr.toString();
        System.out.println("String : " + course);
        System.out.println("String Builder : " + sbr);

        //Stringbuffer -> String
        StringBuffer bf = new StringBuffer("Java class");
        String language = bf.toString();
        System.out.println("String : " + language);
        System.out.println("String Builder : " + bf);

        //Stringbuffer -> Stringbuilder
        StringBuffer sbf = new StringBuffer("I am string buffer");
        String string = sbf.toString();
        StringBuilder sbr1 = new StringBuilder(string);
        sbr1.append(" now");
        System.out.println(sbr1);

    }
}
