package com.Collectionn;


import java.util.LinkedHashSet;


public class LinkedHashSet_Ex {
    public static void main(String[]args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Sowndharya");
        names.add("Vignesh");
        names.add("Bala");
        names.add("Besant");
        names.add("Sowndharya");
        names.add(null);
        names.add(null);

        System.out.println(names);

        names.remove("Besant");
        System.out.println(names);

    }
}
