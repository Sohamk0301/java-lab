package com.deloitte.lab09.ex02;

import java.util.function.Function;

public class SpaceInsert {

	 public static void main(String[] args) {

	        String input = "CG";

	        Function<String, String> formatString = str -> {
	            StringBuilder newStr = new StringBuilder();
	            for (char ch : str.toCharArray()) {
	                newStr.append(ch).append(" ");
	            }
	            return newStr.toString().trim();
	        };

	        String output = formatString.apply(input);
	        System.out.println("new string with space: " + output);
	    }
	
}
