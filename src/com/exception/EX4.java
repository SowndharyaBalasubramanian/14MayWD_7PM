package com.exception;

public class EX4 {
    public static void main(String[] args){

        int a = 3 , b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
