package com.Collectionn;

import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Ex {
    public static void main(String[]args) {
        TreeSet<Integer> age = new TreeSet<>();

        age.add(12);
        age.add(45);
        age.add(89);
        age.add(58);
        age.add(25);
        age.add(65);
        age.add(45);

        System.out.println(age);

//        System.out.println("First : " + age.first());
//        System.out.println(age);
//        System.out.println("Last : " + age.last());
//        System.out.println(age);
//        System.out.println("Poll First : " + age.pollFirst());
//        System.out.println(age);
//        System.out.println("Poll Last : " +age.pollLast());
//        System.out.println(age);

//        System.out.println(age.floor(45));
//        System.out.println(age.floor(43));
//        System.out.println(age.floor(3));

//        System.out.println(age.ceiling(45));
//        System.out.println(age.ceiling(55));
//        System.out.println(age.ceiling(90));

//        System.out.println(age.headSet(45));
//        System.out.println(age.tailSet(45));
//
//        System.out.println(age.subSet(25, 65));

        NavigableSet<Integer> desc = age.descendingSet();
        System.out.println(desc);

    }
}


//sorted and navigable set

//collection > Set > SortedSet > Navigableset > TreeSet