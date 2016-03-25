package com.dralong.design.test;

import com.dralong.design.composite.CompositeTree;
import com.dralong.design.composite.TreeNode;

public class CompositeTest {
	public static void main(String[] args) {

		CompositeTree tree = new CompositeTree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");

	}
}
