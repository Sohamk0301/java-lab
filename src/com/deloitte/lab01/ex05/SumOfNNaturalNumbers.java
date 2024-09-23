package com.deloitte.lab01.ex05;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public int calculateSum(int n) {
		int sum = 0;
		int count = 0;

		for (int i = 1; count < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				count++;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SumOfNNaturalNumbers n1 = new SumOfNNaturalNumbers();
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int result = n1.calculateSum(n);
		sc.close();
		System.out.println("The sum of given first n natural numbers is " + result);
	}
}
