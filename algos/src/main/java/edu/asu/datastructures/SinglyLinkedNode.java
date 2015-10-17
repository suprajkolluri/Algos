package edu.asu.datastructures;

public class SinglyLinkedNode<T> {
	private T value;
	private SinglyLinkedNode<T> next;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public SinglyLinkedNode<T> getNext() {
		return next;
	}

	public void setNext(SinglyLinkedNode<T> next) {
		this.next = next;
	}
}
