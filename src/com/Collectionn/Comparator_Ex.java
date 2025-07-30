package com.Collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Ex {
    public static void main(String[]args) {
        List<Studnt> list1 = new ArrayList<>();
        list1.add(new Studnt("Sowndharya", 27));
        list1.add(new Studnt("Vignesh", 29));
        list1.add(new Studnt("Kavitha", 45));
        list1.add(new Studnt("Devi", 25));
        list1.add(new Studnt("Monisha", 17));

        Collections.sort(list1, new AgeComparator());

        for (Studnt s: list1){
            System.out.println(s.name + " "+ s.age);
        }
    }
}

class Studnt {

    String name;
    int age;

    Studnt(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class NameComparator implements Comparator<Studnt>{

    public int compare(Studnt s1, Studnt s2){
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Studnt>{

    public int compare(Studnt s1, Studnt s2){
        return s1.age- s2.age;
    }
}