package com.deloitte.lab06.ex02;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	
    public static Map<Character, Integer> countChars(char[] arr) {
       
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        
        for (char c : arr) {
           
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } 
            else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }

    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'a', 'c', 'b', 'd', 'a', 'c' , 'x' , 'y' , 'y' , 'z'};
        
        Map<Character, Integer> charCounts = countChars(charArray);

        System.out.println("Character counts: " + charCounts);
    }
	
}
