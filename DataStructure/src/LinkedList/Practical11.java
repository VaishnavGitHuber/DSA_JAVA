/* 
package LinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class CircularLinkedList {
	Node head,tail;
	
	// initialising head and tail
	CircularLinkedList(){
		this.head = null;
		this.tail = null;
	}
	// checking whether the linked list is empty or not
	boolean isEmpty() {
		return head == null;
	}
	// create a node with data from user 
	Node createNode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}
	
	void addFirst() {
		if(isEmpty()) {
			Node newNode = createNode();
			newNode.next = newNode;
			head = newNode;
			tail = newNode;
			return;
		}else {
			Node temp = head;
			Node newNode = createNode();
			
			while(temp.next != head) {
				temp = temp.next;
			}temp.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	void addLast() {
		if(isEmpty()) {
			addFirst();
			return;
		}else {
			Node newNode = createNode();
			newNode.next = head;
			Node temp = head;
			
			while(temp.next != head) {
				temp = temp.next;
			}temp.next = newNode;
			tail = newNode;
		}
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("LinkedList is empty: ");
			return;
		}else {
			Node temp = head;
			while(temp.next != head) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}System.out.println(temp.data);
		}
	}
	
	int enterPos() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int pos = sc.nextInt();
		return pos;
	}
	
	// adding the Node a specified position 
	void addMiddle() {
		if(isEmpty()) {
			addFirst();
			return;
		}else {
			int pos = enterPos();
			if (pos == 0) {
				addFirst();
				return;
			}else {
				Node temp = head;
				Node newNode = createNode();
				for(int i = 0;i < pos-1;i++) {
					temp = temp.next;
				}newNode.next = temp.next;
				temp.next = newNode;
			}
		}
	}
	
	void emptyMessage() {
		System.out.println("Linked List is Empty");
	}
	
	void deleteFirst() {
		if(isEmpty()) {
			emptyMessage();
		}else {
			if(head.next == head) {
				head = null;
				tail = null;
			}else {
				Node temp = head;
				
				while(temp.next != head)
				{
					temp = temp.next; 
					}temp.next = head.next;
					head = head.next;
				}
		}
	}
	
	void deleteLast() {
		if(isEmpty()) {
			emptyMessage();
		}else {
			if(head.next == null) {
				head = null;
				tail = null;
			}else {
				Node temp = head;
				while(temp.next.next != head) {
					temp = temp.next;
				}temp.next = head;
			}
		}
	}
	
	void deleteMiddle() {
		if(isEmpty()) {
			emptyMessage();
		}else {
			if(head.next == null) {
				head = null;
				tail = null;
			}else {
				int pos = enterPos();
				if (pos == 0) {
					deleteFirst();
					return;
				}else {
					Node temp = head;
					
					for(int i = 0;i < pos -1;i++) {
						temp = temp.next;
					}temp.next = temp.next.next;
				}
			}
		}
	}
	
	
	void count_node() {
		int count = 0;
		
		if(isEmpty()) {
			System.out.println(0);
			return;
		}else {
			if(head.next == head) {
				System.out.println(1);
				return;
			}else {
				Node temp = head;
				
				while(temp.next != head) {
					temp = temp.next;
					count += 1;
				}count ++;
				System.out.println(count);
				}
		}
		
	}

}



public class Practical11 {
	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	public static void main(String args[]) {
		CircularLinkedList list = new CircularLinkedList();
		System.out.println(factorial(5));
	}
}*/