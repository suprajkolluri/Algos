package edu.asu.sort;

import edu.asu.Sorter;

public class QuickSort implements Sorter {

	// Worst Case O(n**2)
	// Best Case O(nlogn)
	@Override
	public int[] sort(int[] inputArray) {
		quickSort(inputArray, 0, inputArray.length - 1);
		return inputArray;
	}

	private int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (inputArray[i] <= pivot) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[pIndex];
				inputArray[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = inputArray[pIndex];
		inputArray[pIndex] = inputArray[end];
		inputArray[end] = temp;
		return pIndex;
	}

	private void quickSort(int[] inputArray, int start, int end) {
		if (start < end) {
			int pIndex = partition(inputArray, 0, end);
			quickSort(inputArray, start, pIndex - 1);
			quickSort(inputArray, pIndex + 1, end);
		}
	}
}
