package edu.asu.sort;

import edu.asu.Sorter;

public class SelectionSort implements Sorter {

	// Time complexity O(n**2)
	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[min]) {
					min = j;
				}
			}
			int temp = inputArray[i];
			inputArray[i] = inputArray[min];
			inputArray[min] = temp;
		}
		return inputArray;
	}

	// Time complexity O(n**2)
	public int[] sort_recurive(int[] inputArray, int startIndex) {
		if (startIndex > inputArray.length - 1) {
			return inputArray;
		}
		int min = startIndex;
		for (int j = startIndex + 1; j < inputArray.length; j++) {
			if (inputArray[j] < inputArray[min]) {
				min = j;
			}
		}
		int temp = inputArray[startIndex];
		inputArray[startIndex] = inputArray[min];
		inputArray[min] = temp;
		return sort_recurive(inputArray, startIndex + 1);

	}
}
