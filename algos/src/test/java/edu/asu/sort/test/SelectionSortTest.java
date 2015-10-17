package edu.asu.sort.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import edu.asu.sort.SelectionSort;

public class SelectionSortTest {

	@Test
	public void selctionSortTest() {
		SortExecutor exec = new SortExecutor();
		exec.execute(new SelectionSort());
	}

	@Test
	public void selectionSortRecursiveTest() {
		SelectionSort sorter = new SelectionSort();
		assertArrayEquals(InputOutputArrays.output1, sorter.sort_recurive(InputOutputArrays.input1, 0));
		assertArrayEquals(InputOutputArrays.output2, sorter.sort_recurive(InputOutputArrays.input2, 0));
		assertArrayEquals(InputOutputArrays.output3, sorter.sort_recurive(InputOutputArrays.input3, 0));
	}
}
