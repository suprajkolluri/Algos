package edu.asu.sort.test;

import org.junit.Test;

import edu.asu.sort.MergeSort;

public class MergeSortTest {
	@Test
	public void mergeSortTest() {
		SortExecutor exec = new SortExecutor();
		exec.execute(new MergeSort());
	}
}
