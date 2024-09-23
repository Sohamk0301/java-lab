package com.deloitte.lab02.ex02;

import java.util.Arrays;

public class Sorter {

	public String[] sortStrings(String[] arr) {

		Arrays.sort(arr);

		int n = arr.length;
		int mid = (n + 1) / 2;

		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			if (i < mid) {
				result[i] = arr[i].toUpperCase();
			} else {
				result[i] = arr[i].toLowerCase();
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Sorter sorter = new Sorter();

		String[] strings = { "abc", "xyz", "pqr", "lmn", "ijk" };
		String[] sortedStrings = sorter.sortStrings(strings);

		System.out.println("Sorted and formatted strings:");
		for (String str : sortedStrings) {
			System.out.println(str);
		}
	}
}
