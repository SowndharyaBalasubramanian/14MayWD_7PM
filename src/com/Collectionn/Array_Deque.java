package com.Collectionn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Deque {
    public static void main(String[]args){
        Deque <String> names = new ArrayDeque<>();
        names.add("Java");
        names.add("python");
        names.addFirst("Springboot");
        names.addLast("React");
        System.out.println(names);

        System.out.println(names.removeFirst());
        System.out.println(names.removeLast());
        System.out.println(names.peekFirst());
        System.out.println(names.peekLast());
        System.out.println(names.pollFirst());
        System.out.println(names.pollLast());
       // System.out.println(names.pop());
    }
}
