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
		list.prepend(100);
		list.prepend(25);
		System.out.println(list);
		System.out.println(list.nthFromLast(5));
		System.out.println(list.length());
		System.out.println(list.removeLast());
		list.insertLast(50);
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.length());

	}
}
