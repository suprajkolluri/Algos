package edu.asu.sort.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import edu.asu.Sorter;

public class SortExecutor {

	public void execute(Sorter sorter) {
		System.out.println("Input-->" + Arrays.toString(InputOutputArrays.input1));
		System.out.println("Input-->" + Arrays.toString(InputOutputArrays.input2));
		System.out.println("Input-->" + Arrays.toString(InputOutputArrays.input3));

		assertArrayEquals(InputOutputArrays.output1, sorter.sort(InputOutputArrays.input1));
		assertArrayEquals(InputOutputArrays.output2, sorter.sort(InputOutputArrays.input2));
		assertArrayEquals(InputOutputArrays.output3, sorter.sort(InputOutputArrays.input3));

		System.out.println("Output-->" + Arrays.toString(sorter.sort(InputOutputArrays.input1)));
		System.out.println("Output-->" + Arrays.toString(sorter.sort(InputOutputArrays.input2)));
		System.out.println("Output-->" + Arrays.toString(sorter.sort(InputOutputArrays.input3)));

	}
}
