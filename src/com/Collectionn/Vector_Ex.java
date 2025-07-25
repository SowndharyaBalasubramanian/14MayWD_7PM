package com.Collectionn;

import java.util.Vector;

public class Vector_Ex {
    public static void main(String[]args){
        Vector<Integer> v = new Vector<>();
        v.add(8);
        v.add(9);
        v.remove(0);
        v.size();
        System.out.println(v);
        v.clear();
        System.out.println(v);

    }
}
