package com.deloitte.lab01.ex06;

public class CalDiff {
	
	
	public int calculate(int n) {
		int sumOfSquares = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sumOfSquares += i * i;
			sum += i;
		}

		int squareOfSum = sum * sum;

		return sumOfSquares - squareOfSum;
	}

	public static void main(String[] args) {
		CalDiff calculator = new CalDiff();

		int n = 10;
		int result = calculator.calculate(n);
		System.out.println("The difference is :"+ result);
	}
}
