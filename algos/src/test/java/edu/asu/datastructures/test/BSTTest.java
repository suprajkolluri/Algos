package edu.asu.datastructures.test;

import org.junit.Test;

import edu.asu.datastructures.bst.BinarySearchTree;

public class BSTTest {

	@Test
	public void treeInsertionTest() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(0);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(-10);
		tree.insert(5);
		tree.insert(60);
		tree.insert(25);
		System.out.println(tree.maximum());
		System.out.println(tree.minimum());
		System.out.println(tree.getHeight());
		System.out.println(tree.getHeightRecursive());
		System.out.println(tree.sumOfAllNodes());
		//tree.printPathToLeaves();
		
	}
}
