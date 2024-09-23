package com.deloitte.lab02.ex04;

import java.util.Arrays;

public class ArrayEx04 {
	public static int[] modifyArray(int[] arr) {

		int n = arr.length;
		int[] tempArray = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int k = 0; k < j; k++) {
				if (arr[i] == tempArray[k]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				tempArray[j++] = arr[i];
			}
		}

		int[] newArray = new int[j];
		for (int i = 0; i < j; i++) {
			newArray[i] = tempArray[i];
		}

		Arrays.sort(newArray);
		int[] descendingArray = new int[newArray.length];
		for (int i = 0; i < newArray.length; i++) {
			descendingArray[i] = newArray[newArray.length - 1 - i];
		}

		return descendingArray;
	}

	public static void main(String[] args) {
		int[] inputArray = { 5,5 , 3 , 3 , 2 ,2 };
		int[] modifiedArray = modifyArray(inputArray);

		System.out.println(Arrays.toString(modifiedArray));
	}
}
