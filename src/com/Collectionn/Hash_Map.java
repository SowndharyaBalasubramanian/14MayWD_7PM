package com.Collectionn;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[]args) {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Sowndharya");
        hashmap.put(1, "Sowndharya");
        hashmap.put(1, "Bala");
        hashmap.put(2, "Devi");
        hashmap.put(3, "Devi");
        hashmap.put(4, "Keerthana");
        hashmap.put(5, "saradha");

        System.out.println(hashmap);
        System.out.println(hashmap.remove(3, "Devi"));
        System.out.println(hashmap);
        System.out.println(hashmap.remove(2));
        System.out.println(hashmap.get(4));
        System.out.println(hashmap.replace(4, "Keerthana", "krithi"));
        System.out.println(hashmap);
        System.out.println(hashmap.containsValue("saradha"));
        System.out.println(hashmap.containsKey(1));
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.entrySet());

//        for (Map.Entry<Integer,String> entry : hashmap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//    }

        for(Integer key : hashmap.keySet()){
            System.out.println("Key : " + key + " " + hashmap.get(key));
        }

    }
}
