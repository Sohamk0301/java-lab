package com.deloitte.lab06.ex03;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {

	  public static Map<Integer, Integer> getSquares(int[] numbers) {

	        Map<Integer, Integer> squaresMap = new HashMap<>();

	        for (int number : numbers) {

	            int square = number * number;

	            squaresMap.put(number, square);
	        }

	        return squaresMap;
	    }

	    public static void main(String[] args) {

	        int[] numbers = {1, 2, 3};

	        Map<Integer, Integer> squares = getSquares(numbers);

	        System.out.println("Numbers and their squares: " + squares);
	    }
	
}
