package com.Collectionn;

import java.util.LinkedList;

public class LinkedList_Ex {
    public static void main(String[]args){
        LinkedList<String> courses = new LinkedList<>();
        courses.add("java");
        courses.add("javascript");
        courses.add("Springboot");
        courses.add("react");

        System.out.println(courses);

        courses.remove(3);
        System.out.println(courses);

        courses.addFirst("C");
        courses.addLast("Angular");
        System.out.println(courses);

        courses.removeFirst();
        courses.removeLast();
        System.out.println(courses);

     courses.push("html");
        System.out.println(courses);

        courses.add(3, "css");
        System.out.println(courses);





    }
}
