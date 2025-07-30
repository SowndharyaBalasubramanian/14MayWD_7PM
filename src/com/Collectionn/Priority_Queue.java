package com.Collectionn;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[]args) {
        Queue<Integer> number = new PriorityQueue<>();
        number.add(23);
        number.add(45);
        number.add(1);
        number.add(32);

        System.out.println(number);

//        System.out.println(number.remove(23));
//        System.out.println(number.offer(21));
        System.out.println(number.peek());
        System.out.println(number);
        System.out.println(number.poll());
        System.out.println(number);
        System.out.println(number.remove());
        System.out.println(number);
    }

}
