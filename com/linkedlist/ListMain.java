package com.linkedlist;

public class ListMain {
	public static void main(String[] args) {
		
	
	LinkedList linkedList = new LinkedList();
	linkedList.insert(56);
	linkedList.insert(70);
	System.out.println("Original list: ");
	linkedList.display();
	linkedList.insertInbtwn(30);
	System.out.println("updated list: ");
	linkedList.display();
	linkedlist.pop();
	System.out.println("After deleting the first node");
	linkedList.display();
	}
}