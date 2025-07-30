package com.Collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Ex {
    public static void main(String[]args){
        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(78);
        number.add(23);
        System.out.println(number);

        Iterator<Integer> it = number.iterator();

        while (it.hasNext()){
            int num = it.next();
            System.out.println(num);
        }


    }
}
