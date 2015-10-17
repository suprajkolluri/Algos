package edu.asu.datastructures;

public class SinglyLinkedList<T> {

	SinglyLinkedNode<T> head = null;

	public void prepend(T value) {
		SinglyLinkedNode<T> node = new SinglyLinkedNode<T>();
		node.setValue(value);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public T removeLast() {
		T value = null;
		SinglyLinkedNode<T> curNode = this.head;
		SinglyLinkedNode<T> preNode = null;
		if (curNode != null) {
			while (curNode.getNext() != null) {
				preNode = curNode;
				curNode = curNode.getNext();
			}
			if (curNode == this.head) {
				this.head = null;
			} else {
				preNode.setNext(null);
			}
			value = curNode.getValue();
		}

		return value;
	}

	@Override
	public String toString() {
		String returnString = null;
		if (this.head == null) {
			returnString = "Linked List Empty";
		} else {
			SinglyLinkedNode<T> curNode = this.head;
			StringBuffer buf = new StringBuffer();
			buf.append("Linked List");
			while (curNode != null) {
				buf.append("-->").append(curNode.getValue());
				curNode = curNode.getNext();
			}
			returnString = buf.toString();
		}
		return returnString;

	}
}
