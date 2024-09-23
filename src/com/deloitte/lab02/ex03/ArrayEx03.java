package com.deloitte.lab02.ex03;

import java.util.Arrays;

public class ArrayEx03 {

	public static int[] getSorted(int[] arr) {
		String[] reversedStrings = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedStrings[i] = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
		}

		int[] reversedNumbers = new int[arr.length];
		for (int i = 0; i < reversedStrings.length; i++) {
			reversedNumbers[i] = Integer.parseInt(reversedStrings[i]);
		}

		Arrays.sort(reversedNumbers);
		return reversedNumbers;
	}

	public static void main(String[] args) {
		int[] inputArray = { 123, 456, 789, 321 };
		int[] sortedReversedArray = getSorted(inputArray);

		System.out.println(Arrays.toString(sortedReversedArray));
	}
}
