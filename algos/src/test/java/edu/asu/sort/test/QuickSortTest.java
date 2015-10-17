package edu.asu.sort.test;

import org.junit.Test;

import edu.asu.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void quickSortTest() {
		SortExecutor exec = new SortExecutor();
		exec.execute(new QuickSort());
	}
}
