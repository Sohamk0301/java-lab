package com.deloitte.lab06.ex01;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HashMapEx1 {

    public static List<Integer> getValues(HashMap<String, Integer> map) {
      
        Collection<Integer> values = map.values();

        List<Integer> valuesList = new ArrayList<>(values);

        Collections.sort(valuesList);

        return valuesList;
    }

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Five", 5);
        map.put("Three", 3);
        map.put("Four", 4);
        
        List<Integer> sortedValues = getValues(map);

        System.out.println("Sorted values: " + sortedValues);
    }
}
