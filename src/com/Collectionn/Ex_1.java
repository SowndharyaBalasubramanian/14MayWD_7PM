package com.Collectionn;

import java.util.ArrayList;
import java.util.List;

public class Ex_1 {
    public static void main(String[]args){
        //Type of interface  <Datatype>  varName = new class <>();
        List <Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(20);
        numbers.add(152);

        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);


        boolean present = numbers.isEmpty();
        System.out.println(present);

        boolean contains = numbers.contains(152);
        System.out.println(contains);

        int size = numbers.size();
        System.out.println(size);

        int get = numbers.get(2);
        System.out.println(get);

        numbers.set(2,5);
        System.out.println(numbers);

        numbers.add(2,7);
        System.out.println(numbers);

        for(int i = 0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        }
}
