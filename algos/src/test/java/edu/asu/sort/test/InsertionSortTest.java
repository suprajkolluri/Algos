package edu.asu.sort.test;

import org.junit.Test;

import edu.asu.sort.InsertionSort;

public class InsertionSortTest {

	@Test
	public void insertionSortTest() {
		SortExecutor exec = new SortExecutor();
		exec.execute(new InsertionSort());
	}
}
