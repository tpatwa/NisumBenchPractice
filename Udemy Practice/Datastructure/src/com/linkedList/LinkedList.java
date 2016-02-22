package com.linkedList;

public class LinkedList {

	private Node head;

	public void InsertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	public int GetLength() {
		int len = 0;
		Node current = this.head;
		while (current != null) {
			len++;
			current = current.getNextNode();
		}
		return len;
	}

	public void DeleteFromHead() {
		this.head = this.head.getNextNode();
	}

	public Node FindNode(int data) {

		Node current = this.head;

		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();

		}
		result += "}";
		return result;

	}

}
