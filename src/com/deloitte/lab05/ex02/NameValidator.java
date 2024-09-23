package com.deloitte.lab05.ex02;

public class NameValidator {

	public static void main(String[] args) {
		try {
			Employee emp1 = new Employee("Soham", "Kulkarni");
			emp1.displayFullName();

			Employee emp2 = new Employee("", "Kulkarni");
			emp2.displayFullName();
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}

		try {
			Employee emp3 = new Employee("Soham", "");
			emp3.displayFullName();
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
	}

}

class InvalidNameException extends Exception {
	public InvalidNameException(String message) {
		super(message);
	}
}

class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) throws InvalidNameException {
		if (firstName == null || firstName.trim().isEmpty()) {
			throw new InvalidNameException("First name blank");
		}
		if (lastName == null || lastName.trim().isEmpty()) {
			throw new InvalidNameException("Last name blank.");
		}

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void displayFullName() {
		System.out.println("Employee Full Name: " + firstName + " " + lastName);
	}
}
