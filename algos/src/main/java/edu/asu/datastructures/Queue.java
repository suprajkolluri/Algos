package edu.asu.datastructures;

public class Queue<T> {
	SinglyLinkedList<T> list = new SinglyLinkedList<T>();

	public void enqueue(T value) {
		list.prepend(value);
	}

	public T dequeue() {
		return list.removeLast();
	}
}
