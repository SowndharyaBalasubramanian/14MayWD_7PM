package com.exception;


 class InvalidAgeException extends Exception{
     public InvalidAgeException(String message){
         super(message);
     }
 }

public class Custom_ExceptionHandling {

     public static void checkAge(int age) throws InvalidAgeException{
         if(age <18){
             throw new InvalidAgeException("you are minor");
         }else{
             System.out.println("major");
         }
     }
    public static void main(String[] args){
        try {
            checkAge(15);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
