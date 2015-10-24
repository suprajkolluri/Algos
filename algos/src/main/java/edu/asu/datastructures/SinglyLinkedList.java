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

	public void insertLast(T value) {
		SinglyLinkedNode<T> node = new SinglyLinkedNode<T>();
		node.setValue(value);
		if (head == null) {
			head = node;
		} else {
			SinglyLinkedNode<T> curNode = this.head;
			while (curNode.getNext() != null) {
				curNode = curNode.getNext();
			}
			curNode.setNext(node);
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

	public T removeFirst() {
		T value = null;
		SinglyLinkedNode<T> curNode = this.head;
		if (curNode != null) {
			this.head = curNode.getNext();
			value = curNode.getValue();
		}
		return value;
	}

	public T nthFromLast(int n) {
		T value = null;
		int length = length();
		if (n < length) {
			SinglyLinkedNode<T> curNode = this.head;
			int k = 1;
			while (curNode != null) {
				if (k == length - n) {
					value = curNode.getValue();
					break;
				}
				curNode = curNode.getNext();
				k++;
			}
		}

		return value;
	}

	public int length() {
		int length = 1;
		if (this.head == null) {
			length = 0;
		} else {
			SinglyLinkedNode<T> curNode = this.head;
			while (curNode.getNext() != null) {
				curNode = curNode.getNext();
				length++;
			}
		}

		return length;

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
