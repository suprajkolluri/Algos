package edu.asu.sort;

import edu.asu.Sorter;

public class BubbleSort implements Sorter {

	// Best Case O(n)
	// Worst Case O(m**2)
	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < inputArray.length - i - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
					flag += 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		return inputArray;
	}
}
