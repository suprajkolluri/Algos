package edu.asu.sort;

import edu.asu.Sorter;

public class InsertionSort implements Sorter {

	// Worst Case O(n**2)
	// Best Case O(n)
	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			int key = inputArray[i];
			int hole = i;
			while (hole > 0 && inputArray[hole - 1] > key) {
				inputArray[hole] = inputArray[hole - 1];
				hole = hole - 1;
			}
			inputArray[hole] = key;
		}
		return inputArray;
	}

}
