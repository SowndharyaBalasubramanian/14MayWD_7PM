package com.Collectionn;

import java.util.Stack;


public class Stack_Ex {
    public static void main(String[]args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.add(8);
        System.out.println(stack);


       int pop =  stack.pop();
        System.out.println(pop);
        System.out.println(stack);

        int peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);



    }
}

//LIFO order
