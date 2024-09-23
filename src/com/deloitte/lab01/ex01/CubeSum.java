package com.deloitte.lab01.ex01;

public class CubeSum {

	public static void main(String[] args) {
		int number = 1234;
		int sum = sumOfCubesOfDigits(number);
		System.out.println("The sum is " + sum);
	}

	public static int sumOfCubesOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit * digit;
			n /= 10;
		}

		return sum;
	}
}
