package com.linkedList;

public class DoublyLinkedList {

	private DoublyLinkedNode head;

	public void InsertAtHead(int data) {

		DoublyLinkedNode newNode = new DoublyLinkedNode(data);

		newNode.setNextNode(this.head);
		if (this.head != null) {

			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;

	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		DoublyLinkedNode n = this.head;

		while (n != null) {
			str.append("Node Data: ");
			str.append(n.getData());
			n = n.getNextNode();

		}
		
		return str.toString();

	}
}
