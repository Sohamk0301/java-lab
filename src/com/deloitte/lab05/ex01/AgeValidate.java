package com.deloitte.lab05.ex01;

public class AgeValidate {

	public static void validateAge(int age) throws AgeValidationException {
		if (age <= 15) {
			throw new AgeValidationException(" Age must be above 15.");
		} else {
			System.out.println("Age valid.");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(10);
		} catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}

		try {
			validateAge(18);
		} catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}
	}
}

class AgeValidationException extends Exception {

	public AgeValidationException(String message) {
		super(message);
	}
}
