package com.Collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Ex {
    public static void main(String[]args){

        List<Student> list = new ArrayList<>();
        list.add(new Student("Sowndharya", 27));
        list.add(new Student("Vignesh", 29));
        list.add(new Student("Kavitha", 45));
        list.add(new Student("Devi", 25));
        list.add(new Student("Monisha", 17));

        Collections.sort(list);
        for (Student s: list){
            System.out.println(s.name + " "+ s.age);
        }

    }
}

class Student implements Comparable<Student>{

    String name ;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s){
        //return this.age-s.age;
        return s.name.compareTo(this.name);
    }
}


//27  29  45  25  17

//27-29  => -2     27  29
//27-45 => -       27  45
//27-25 => 2       25   27
//27-17 => 10      17   27
//29-45 => -       29   45
//29-25 => 4       25   29
//29-17 => 12      17   29
//45-25=> 20       25   45
//45-17 => +       17   45
//25-17 => 8       17   25


//17  25  27  29  45
