package com.BinaryTree;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int data) {

		this.data = data;
	}

	public int getData() {
		return this.data;

	}

	public TreeNode find(int data) {
		if (this.data == data) {
			return this;
		}
		if (data < this.data && this.leftChild != null) {
			return leftChild.find(data);
		}
		if (rightChild != null) {

			return rightChild.find(data);
		}
		return null;
	}

	public void Insert(int data) {
		if (data > this.data) {
			if (this.rightChild == null) {

				this.rightChild = new TreeNode(data);
			} else {

				this.rightChild.Insert(data);
			}
		} else {
			if (this.leftChild == null) {

				this.leftChild = new TreeNode(data);
			} else {

				this.leftChild.Insert(data);
			}
		}
	}
	
	public int smallest()
	{
		if ( this.leftChild==null)
				return this.data;
		return this.leftChild.smallest();
		
		
	}
	
	public int largest()
	{
		if ( this.rightChild==null)
				return this.data;
		return this.rightChild.largest();
		
		
	}
	

	public TreeNode getleftChild() {
		return this.leftChild;
	}

	public void setleftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getrightChild() {
		return this.rightChild;
	}

	public void setrightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "Data : " + this.data;
	}
}
