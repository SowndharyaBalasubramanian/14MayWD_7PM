package com.exception;

public class Ex3 {
    public static void main(String[] args){
        String name = "Java";

        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
