package com.linkedList;

public class Demo {

	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.InsertAtHead(1);
		ll.InsertAtHead(3);
		ll.InsertAtHead(9);
		ll.InsertAtHead(6);
		ll.InsertAtHead(7);
		ll.InsertAtHead(8);
		
		
		ll.DeleteFromHead();
		System.out.println(ll);
		System.out.println(ll.GetLength());
		System.out.println("Found:" + ll.FindNode(78));
		
		
	
		
	}
}
