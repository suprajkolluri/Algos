package edu.asu.datastructures.bst;

public class BinarySearchNode {
	private Integer value = null;
	private BinarySearchNode left = null;
	private BinarySearchNode right = null;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public BinarySearchNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchNode left) {
		this.left = left;
	}

	public BinarySearchNode getRight() {
		return right;
	}

	public void setRight(BinarySearchNode right) {
		this.right = right;
	}

}
