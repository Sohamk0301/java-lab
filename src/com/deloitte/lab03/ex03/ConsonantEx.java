package com.deloitte.lab03.ex03;

public class ConsonantEx {

	 public static String alterString(String input) {
	        StringBuilder modified = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (isConsonant(ch)) {
	                modified.append((char) (ch + 1));
	            } else {
	                modified.append(ch);
	            }
	        }

	        return modified.toString();
	    }

	    private static boolean isConsonant(char ch) {
	      
	        return Character.isLetter(ch) && !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	    }

	    public static void main(String[] args) {
	        String input = "JAVA";
	        String result = alterString(input);
	        System.out.println(result);
	    }
}
