package com.dinatechy.challange;

public class SinglyLinkedList {
	
	Node head;// data-10, next-null -> 
	
	public void add(int data) {// 10, 20
		Node nextNode = new Node(data);
		
		if(head == null) {
			head = nextNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = nextNode;
		}
		
	}
	
	public void display() {
		
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
		
	}
	
	//We use slow and fast pointer's
	public Node findMiddle() {
		if(head == null)
			return null;
		else {
			Node slow = head; // 1, 2, 3
			Node fast = head; // 2, 4, 6
			// O(n) with O(1) Time Complexity
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.display();
		Node middleNode = list.findMiddle();
		System.out.println("The Middle value is : "+middleNode.data);
		
	}

}
