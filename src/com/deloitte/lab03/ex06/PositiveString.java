package com.deloitte.lab03.ex06;

public class PositiveString {

	public static boolean isPositiveString(String input) {
       
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) >= input.charAt(i + 1)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Soham";
        
        System.out.println(str + " is positive: " + isPositiveString(str));     
    }
	
}
