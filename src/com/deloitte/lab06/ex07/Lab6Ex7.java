package com.deloitte.lab06.ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex7 {

	public static int[] getSorted(int[] arr) {

		List<Integer> reversedNumbers = new ArrayList<>();

		for (int num : arr) {
			StringBuilder reversed = new StringBuilder(String.valueOf(num));
			reversedNumbers.add(Integer.parseInt(reversed.reverse().toString()));
		}

		Collections.sort(reversedNumbers);

		int[] sortedArray = new int[reversedNumbers.size()];
		for (int i = 0; i < reversedNumbers.size(); i++) {
			sortedArray[i] = reversedNumbers.get(i);
		}

		return sortedArray;
	}

	public static void main(String[] args) {

		int[] numbers = { 123, 456, 789, 234 };

		int[] sortedResult = getSorted(numbers);

		System.out.print("Sorted array after reversing: ");
		for (int num : sortedResult) {
			System.out.print(num + " ");
		}
	}

}
