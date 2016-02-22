package com.BinaryTree;

public class BinarySearchTree {

	private TreeNode root;

	public void InsertIntoTree(int data) {
		if (this.root == null)
			this.root = new TreeNode(data);
		else
			root.Insert(data);
	}

	public Integer smallest()
	{
		if(this.root != null)
			return this.root.smallest();
		return null;
		
	}
	
	public Integer Largest()
	{
		if(this.root != null)
			return this.root.smallest();
		return null;
		
	}
	public TreeNode FindTree(int data) {
		if (root != null) {
			return root.find(data);
		}
		return null;
	}

	public void Delete(int data) {

	}
}
