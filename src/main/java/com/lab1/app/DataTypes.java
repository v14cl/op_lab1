package com.lab1.app;
import java.util.HashMap;

public class DataTypes {
    public static HashMap<String, Integer> count_datatypes(Object[] arr) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("Boolean", 0);
        hashmap.put("Integer", 0);
        hashmap.put("Float", 0);
        hashmap.put("Double", 0);
        hashmap.put("String", 0);
        
        for (Object item : arr) {
            if (item instanceof Boolean) {
                hashmap.put("Boolean", hashmap.get("Boolean") + 1);
            } else if (item instanceof Integer) {
                hashmap.put("Integer", hashmap.get("Integer") + 1);
            } else if (item instanceof Float) {
                hashmap.put("Float", hashmap.get("Float") + 1);
            } else if (item instanceof Double) {
                hashmap.put("Double", hashmap.get("Double") + 1);
            } else if (item instanceof String) {
                hashmap.put("String", hashmap.get("String") + 1);
            } else {
                System.out.println("Error: Not registered datatype!");
            }
        }

        return hashmap;
    }
} 

