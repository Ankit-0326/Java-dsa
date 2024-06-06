package com.demo.linklist;

public class Mylinkedlist {
    
	public Node head;
	
	 class Node{
		 int data;
		 Node next;
		 
		 public Node()
		 {
			 data = 0; 
			 next = null;
		 }
		 
		 public Node(int val) {
			 data = val;
			 next = null;
		 }
		 		 
	 }
	 public void display() {
		 if(head == null) {
			 System.out.println("linkidList is empty");
		 }
		 
		 else {
			 for(Node temp = head ; temp != null; temp = temp.next) {
				 System.out.println("data "+temp.data);
			 }
		 }
		 
	 }

	public void addNode(int i) {
		 Node Newnode = new Node(i); 
		 if(head == null) {
			 head = Newnode;
		 }
		 else {
			 
			 Node temp = head;
			 
			 while(temp.next != null) {
				 temp = temp.next;
			 }
			   temp.next = Newnode;
		
		 	}
	}
	
	public void addAtanyPosition(int val ,int pos) {
		Node node = new Node(val);
		if(head == null) {
			System.out.println("list is empty");;
		}
		else {
			
			if(pos == 1) {
				node.next = head;
				head = node;
			}
			else {
				Node temp = head;
			for(int i= 0 ; temp!=null && i<pos-2;i++) {
				temp = temp.next;
			}
			
			if(temp!= null) {
			node.next = temp.next ;
			temp.next = node;
			
		}
		
	
		
	}
		}	    
}
}