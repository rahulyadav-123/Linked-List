package com.linkedlist;

public class ListMain {
public static void main(String[] args) {
	LinkedList linkedlist = new LinkedList();
	linkedlist.insertAtEnd(56);
	linkedlist.insertAtEnd(70);
	System.out.println("Original list: ");
	linkedlist.display();
	
	linkedlist.insertInbtwn(30);
	System.out.println("updated list: ");
	linkedlist.display();
	
	//linkedList.popLast();
	//System.out.println("After deleting the Last node");
	//linkedList.display();
	
	System.out.println("The searched element is: 30");
	Node newNode = new Node(40);
	linkedlist.searchNode(30, newNode);
	linkedlist.display();
	
	System.out.println("The deleted element is: 40");
	linkedlist.deleteSearchNode(40);
	linkedlist.display();
	}
}


