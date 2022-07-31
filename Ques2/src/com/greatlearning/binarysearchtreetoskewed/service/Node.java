package com.greatlearning.binarysearchtreetoskewed.service;

public class Node {
	public Node leftNode, rightNode;
	public int nodeData;

	public Node(int data) {
		this.nodeData = data;
		leftNode = rightNode = null;
	}
}
