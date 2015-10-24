package edu.asu.datastructures;

public class Stack<T> {
	SinglyLinkedList<T> list = new SinglyLinkedList<T>();

	public void push(T value) {
		list.prepend(value);
	}

	public T pop() {
		return list.removeFirst();
	}
}
