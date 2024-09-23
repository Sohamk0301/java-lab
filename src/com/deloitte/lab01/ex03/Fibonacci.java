package com.deloitte.lab01.ex03;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacciNonRecursive(int n) {
		if (n <= 1) {
			return n; // Base case
		}
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		System.out.println("Fibonacci recursive of " + n + " is: " + fibonacciRecursive(n));
		System.out.println("Fibonacci non-recursive of " + n + " is: " + fibonacciNonRecursive(n));

		scanner.close();
	}
}
