package com.Collectionn;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Ex {
    public static void main(String[]args){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(null);
        numbers.add(null);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

        for(Integer n : numbers){
            System.out.println(n);
        }
        numbers.toArray();
        System.out.println(numbers);


        numbers.clear();
        System.out.println(numbers);
    }
}
