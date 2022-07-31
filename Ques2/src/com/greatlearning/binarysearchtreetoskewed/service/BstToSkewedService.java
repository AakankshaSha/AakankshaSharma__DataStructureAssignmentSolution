package com.greatlearning.binarysearchtreetoskewed.service;

public class BstToSkewedService {
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	// Function to to convert the Binary Search Tree to Skewed Tree in ascending
	// order
	public void BstToSkewedConversion(Node root, int order) {
		if (root == null)
			return;

		if (order > 0)
			BstToSkewedConversion(root.rightNode, order);
		else
			BstToSkewedConversion(root.leftNode, order);

		Node right = root.rightNode;
		Node left = root.leftNode;

		if (headNode == null) {
			headNode = root;
			root.leftNode = null;
			prevNode = root;
		} else {
			prevNode.rightNode = root;
			root.leftNode = null;
			prevNode = root;
		}

		if (order > 0)
			BstToSkewedConversion(left, order);
		else
			BstToSkewedConversion(right, order);
	}

	// Recursive function to traverse the right skewed tree
	public void traverseRightSkewed(Node root) {
		if (root == null)
			return;

		System.out.print(root.nodeData + " ");
		traverseRightSkewed(root.rightNode);
	}
}
