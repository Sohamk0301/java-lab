package com.deloitte.lab01.ex08;

public class PowerChecker {

	public boolean checkNumber(int n) {
		if (n <= 0) {
			return false;
		}

		while (n % 2 == 0) {
			n /= 2;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		PowerChecker checker = new PowerChecker();

		int number = 19;
		boolean result = checker.checkNumber(number);
		System.out.println("power of 2 or not " + result);
	}
}
