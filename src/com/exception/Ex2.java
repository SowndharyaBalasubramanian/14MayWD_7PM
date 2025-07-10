package com.exception;

public class Ex2 {
    public static void main(String[] args){

        try{
            int [] arr = new int[3];
            arr[0] = 1;
            arr[3] = 4;

            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("ended");
    }
}
