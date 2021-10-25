package com.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	
	public void insertAtStart(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			}
		else {
			Node temp = head;
			head= node;
			node.next = temp;
		}
	}
	
	public void insertAtEnd(int data) {
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
	 
	 //delete at first
	public void pop() {
			Node toDelete = head;
			head = head.next;
			toDelete = null;
			}
	
	public void popLast() {
		Node temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}	
		temp.next = null;
	}
	
	public void searchNode(int data, Node node) {  
        Node temp = head;     
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(temp != null) {    
                if(temp.data == data) {   
                    break;  
                }  
                temp = temp.next;  
                }  
            Node tempnode = temp.next;
            temp.next = node;
            node.next = tempnode;
        }  
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}