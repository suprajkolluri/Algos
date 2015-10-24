package edu.asu.datastructures.bst;

import java.util.ArrayList;
import java.util.List;

import edu.asu.datastructures.Queue;

public class BinarySearchTree {
	BinarySearchNode head = null;

	public void insert(Integer value) {
		BinarySearchNode valueNode = new BinarySearchNode();
		valueNode.setValue(value);
		if (head == null) {
			head = valueNode;
		} else {
			insertNode(head, valueNode);
		}
	}

	private void insertNode(BinarySearchNode curNode, BinarySearchNode valueNode) {
		if (valueNode.getValue() < curNode.getValue()) {
			if (curNode.getLeft() == null) {
				curNode.setLeft(valueNode);
			} else {
				insertNode(curNode.getLeft(), valueNode);
			}
		} else {
			if (curNode.getRight() == null) {
				curNode.setRight(valueNode);
			} else {
				insertNode(curNode.getRight(), valueNode);
			}
		}
	}

	public void delete(Integer value) {
		// TODO
	}

	public Integer getHeightRecursive() {
		return heightRecursive(head);
	}

	private Integer heightRecursive(BinarySearchNode curNode) {

		if (curNode == null) {
			return -1;
		}

		int left = heightRecursive(curNode.getLeft());

		int right = heightRecursive(curNode.getRight());

		return Math.max(left, right) + 1;

	}

	public Integer getHeight() {
		Integer finalHeight = null;
		if (head == null) {
			finalHeight = -1;
		} else {
			int level = 0;
			int nil = 0;
			Queue<BinarySearchNode> q = new Queue<BinarySearchNode>();
			q.enqueue(head);
			for (int i = 1; i <= Math.pow(2, level); i++) {
				BinarySearchNode node = q.dequeue();
				BinarySearchNode left = node != null ? node.getLeft() : null;
				BinarySearchNode right = node != null ? node.getRight() : null;
				q.enqueue(left);
				q.enqueue(right);
				if (left == null) {
					nil++;
				}
				if (right == null) {
					nil++;
				}
				if (i == Math.pow(2, level)) {
					if (nil == Math.pow(2, level + 1)) {
						break;
					} else {
						i = 0;
						nil = 0;
						level = level + 1;
					}
				}
			}
			finalHeight = level;
		}
		return finalHeight;
	}

	public Integer minimum() {
		BinarySearchNode curNode = this.head;
		while (curNode.getLeft() != null) {
			curNode = curNode.getLeft();
		}

		return curNode.getValue();
	}

	public Integer maximum() {
		BinarySearchNode curNode = this.head;
		while (curNode.getRight() != null) {
			curNode = curNode.getRight();
		}

		return curNode.getValue();

	}

	public void printPathToLeaves() {
		List<Integer> array = new ArrayList<Integer>();
		if (this.head == null) {
			System.out.println("Tree is empty");
		} else {
			pathToLeaves(this.head, array);
		}
	}

	private void pathToLeaves(BinarySearchNode curNode, List<Integer> array) {
		if (curNode.getLeft() == null && curNode.getRight() == null) {
			array.add(curNode.getValue());
			System.out.println(array);
			array.remove(array.size() - 1);
		} else {
			array.add(curNode.getValue());
			if (curNode.getLeft() != null) {
				pathToLeaves(curNode.getLeft(), array);
			}

			if (curNode.getRight() != null) {
				pathToLeaves(curNode.getRight(), array);
			}
			array.remove(array.size() - 1);
		}
	}
}
