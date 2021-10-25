package com.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			}
		else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void insertInbtwn(int data) {
		Node node = new Node(data);
		Node temp = head.next;
		head.next = node;
		node.next = temp;
		}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}