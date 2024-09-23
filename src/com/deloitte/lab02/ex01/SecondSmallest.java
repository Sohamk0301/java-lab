package com.deloitte.lab02.ex01;

import java.util.Arrays;

public class SecondSmallest {

	public int getSecondSmallest(int[] arr) {
		if (arr.length < 2) {
			return -1;
		}

		Arrays.sort(arr);

		return arr[1];
	}

	public static void main(String[] args) {
		SecondSmallest ss = new SecondSmallest();

		int[] numbers = { 5, 3, 8, 1, 2 };
		int secondSmallest = ss.getSecondSmallest(numbers);

		if (secondSmallest != -1) {
			System.out.println("second smallest element is: " + secondSmallest);
		} else {
			System.out.println("enter 2 numbers compulsory");
		}
	}
}
