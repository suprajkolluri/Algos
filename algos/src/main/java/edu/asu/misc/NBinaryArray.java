package edu.asu.misc;

import java.util.Arrays;

public class NBinaryArray {

	int A[];

	public void nBinaryArray(int n) {
		A = new int[n];
		binary(n);

	}

	private void binary(int n) {
		if (n < 1) {
			System.out.println(Arrays.toString(A));
		} else {
			A[n - 1] = 0;
			binary(n - 1);
			A[n - 1] = 1;
			binary(n - 1);
		}
	}
}
