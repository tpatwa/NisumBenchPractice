package com.linkedList;

public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previousNode;

	
	public DoublyLinkedNode(int Data){
	
		this.data =Data;
	}
	public void setdata(int Data) {
		this.data = Data;
	}

	public void setNextNode(DoublyLinkedNode node) {

		this.nextNode = node;
	}

	public void setPreviousNode(DoublyLinkedNode node) {
		this.previousNode = node;

	}

	public int getData() {
		return this.data;
	}

	public DoublyLinkedNode getNextNode() {
		return this.nextNode;

	}

	public DoublyLinkedNode getPreviousNode() {

		return this.previousNode;
	}
}
