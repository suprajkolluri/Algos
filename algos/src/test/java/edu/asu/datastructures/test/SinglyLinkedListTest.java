package edu.asu.datastructures.test;

import org.junit.Test;

import edu.asu.datastructures.SinglyLinkedList;

public class SinglyLinkedListTest {

	@Test
	public void insertionTest() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.prepend(10);
		list.prepend(30);
		list.prepend(0);
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}
