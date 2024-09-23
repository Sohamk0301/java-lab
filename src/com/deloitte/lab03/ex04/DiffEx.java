package com.deloitte.lab03.ex04;

public class DiffEx {

	public static int modifyNumber(int number1) {
		
        String numStr = String.valueOf(number1);
        StringBuilder newNumber = new StringBuilder();

        for (int i = 0; i < numStr.length() - 1; i++) {
            int Digit1 = Character.getNumericValue(numStr.charAt(i));
            int Digit2 = Character.getNumericValue(numStr.charAt(i + 1));
            int difference = Math.abs(Digit1 - Digit2);
            newNumber.append(difference);
        }

        newNumber.append(numStr.charAt(numStr.length() - 1));

        return Integer.parseInt(newNumber.toString());
    }

    public static void main(String[] args) {
        int inputNumber = 46862;
        int result = modifyNumber(inputNumber);
        System.out.println("new Number: " + result); 
    }
}
