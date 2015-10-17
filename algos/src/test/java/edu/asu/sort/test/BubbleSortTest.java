package edu.asu.sort.test;

import org.junit.Test;

import edu.asu.sort.BubbleSort;

public class BubbleSortTest {

	@Test
	public void bubleSortTest() {
		SortExecutor exec = new SortExecutor();
		exec.execute(new BubbleSort());
	}
}
