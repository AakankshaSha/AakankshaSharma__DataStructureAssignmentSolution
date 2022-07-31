package com.greatlearning.binarysearchtreetoskewed.main;

import com.greatlearning.binarysearchtreetoskewed.service.BstToSkewedService;
import com.greatlearning.binarysearchtreetoskewed.service.Node;

public class Driver {

	public static void main(String[] args) {
		BstToSkewedService tree = new BstToSkewedService();
		tree.node = new Node(50);
		tree.node.leftNode = new Node(30);
		tree.node.rightNode = new Node(60);
		tree.node.leftNode.leftNode = new Node(10);
		tree.node.rightNode.leftNode = new Node(55);

		// Order of the Skewed tree, for Ascending order -> 0, for Descending order -> 1
		int ascendingOrder = 0;
		tree.BstToSkewedConversion(tree.node, ascendingOrder);
		tree.traverseRightSkewed(tree.headNode);
	}
}
