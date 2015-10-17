package edu.asu.sort;

import edu.asu.Sorter;

public class MergeSort implements Sorter {
	// Time complexity - O(nlogn)
	@Override
	public int[] sort(int[] inputArray) {
		int n = inputArray.length;
		if (n == 1) {
			return null;
		}
		int mid = n / 2;
		// Extra memory for leftArray, rightArray
		int[] leftArray = new int[mid];
		int[] rightArray = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			leftArray[i] = inputArray[i];
		}
		for (int j = 0; j < (n - mid); j++) {
			rightArray[j] = inputArray[mid + j];
		}
		sort(leftArray);
		sort(rightArray);
		merge(leftArray, rightArray, inputArray);
		return inputArray;
	}

	private void merge(int[] leftArray, int[] rightArray, int[] inputArray) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				inputArray[k] = leftArray[i];
				i = i + 1;
			} else {
				inputArray[k] = rightArray[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i < leftArray.length) {
			inputArray[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < rightArray.length) {
			inputArray[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
