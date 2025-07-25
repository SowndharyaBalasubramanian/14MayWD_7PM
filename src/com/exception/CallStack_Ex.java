package com.exception;

public class CallStack_Ex {
    public static void main(String[] args){
        CallStack_Ex e = new CallStack_Ex();

        try{
            e.methodA();
        }catch (Exception ex){
            System.out.println(ex);
        }finally{
            System.out.println("finally block from main method");
        }

    }

    public void methodA(){
        System.out.println("method A started");
        try{
            methodB();
        }catch (NullPointerException ex1){
            System.out.println(ex1);
        }finally{
            System.out.println("finally block from method A");
        }

        System.out.println("method A ended");
    }

    public void methodB(){
        System.out.println("Method B started");
  int res = 10/0;
        System.out.println(res);

        System.out.println("Method B ended");

    }
}





