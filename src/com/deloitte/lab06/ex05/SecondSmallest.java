package com.deloitte.lab06.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SecondSmallest {

	    public static int getSecondSmallest(int[] arr) {

	        List<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }

	        List<Integer> newList = new ArrayList<>(new HashSet<>(list));

	        Collections.sort(newList);

	        if (newList.size() < 2) {
	            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
	        }

	        return newList.get(1);
	    }

	    public static void main(String[] args) {
	
	        int[] numbers = {5, 3, 1, 4, 2, 3};

	        int secondSmallest = getSecondSmallest(numbers);

	        System.out.println("The second smallest element is: " + secondSmallest);
	    }
	}

	

