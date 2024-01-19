/*package LinkedList;
import java.util.Scanner;

class Node {
	int data;
	Node prev,next;
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}


class DoublyLinkedList {
	// initialization
	Node head,tail;
	int data;
	// constructor
	DoublyLinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	// does the linked list is empty or not 
	boolean isEmpty() {
		return head == null;
	}
	
	// creating a newNode with specified data 
	Node createNode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}
	
	// inserting position
	int askPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int pos = sc.nextInt();
		return pos;
	}
	
	// Add Node at the last
	void addLast() {
		Node newNode = createNode();
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	// AddLast at the node 
	void addFirst() {
		if(isEmpty()) {
			addLast();
		}else {
			Node newNode = createNode();
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	// Adding Node at the Middle of the Linked List 
	void addMiddle() {
		if(isEmpty()) {
			addLast();
		}else {
			if(head.next == null) {
				addLast();
				return;
			}
			if(head.next.next == null) {
				Node newNode = createNode();
				head.next = newNode;
				newNode.prev = head;
				newNode.next = tail;
				tail.prev = newNode;
				return;
			}
			Node newNode = createNode();
			Node temp = head;
			int pos = askPosition();
			for(int i = 0;i < pos-1;i++) {
				temp = temp.next;
			}
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next = newNode;
			temp.next.prev = newNode;
		}
	}
	
	// Display Method 
	void Display() {
		if(isEmpty()) {
			System.out.println("Linked List is empty");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}System.out.println();
		}
	}
	
}

class Practical03 {
	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast();
		list.addLast();
		list.addLast();
		list.Display();
		list.addFirst();
		list.Display();
		list.addMiddle();
		list.Display();
		
	}
}*/