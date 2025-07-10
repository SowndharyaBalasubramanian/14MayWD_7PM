package com.exception;

public class CallStack_Ex {
    public static void main(String[] args){
        CallStack_Ex e = new CallStack_Ex();
        e.methodA();

    }

    public void methodA(){
        System.out.println("method A");
        methodB();
    }

    public void methodB(){
        System.out.println("Method B");
    }
}



