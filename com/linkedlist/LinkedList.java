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
	
	public void searchNode(int data) {  
        Node temp = head;  
        int count = 1;  
        boolean flag = false;   
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(temp != null) {    
                if(temp.data == data) {  
                    flag = true;  
                    break;  
                }  
                count++;  
                temp = temp.next;  
            }  
        }  
        if(flag == true)  
        {
             System.out.println("Element:" + data + " is present at the position " + count); 
        }
        else  
        {
             System.out.println("Element is not present in the list");  
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
