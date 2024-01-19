package LinkedList;
import java.util.Scanner;

// initialization
class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class CircularLinkedList{
	Node head,tail;
	// constructor 
	CircularLinkedList(){
		this.head = null;
		this.tail = null;
	}
	// whether the LinkedList is empty or not 
	boolean isEmpty() {
		return head == null;
	}
	
	// creating a node with specified data 
	Node createNode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}
	
	// inserting position from the users 
	int askPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int position = sc.nextInt();
		return position;
	}
	
	// adding Node at the Last 
	void addLast() {
		Node newNode = createNode();
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	// adding Node at the front 
	void addFirst() {
		if(isEmpty()) {
			addLast();
		}else {
			Node newNode = createNode();
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}
	
	// adding a node at the specified index 
	void addMiddle() {
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
		}else {
			Node newNode = createNode();
			Node temp = head;
			int pos = askPosition();
			for(int i = 0;i < pos-1;i++) {
				temp = temp.next;
			}newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	// displaying Node 
	void display() {
		if(isEmpty()) {
			System.out.println("Linked List is empty!.. ");
		}else {
			Node temp = head;
			while(temp.next != head) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}System.out.println(temp.data);
		}
	}
}

public class Practical12 {
	public static void main(String args[]) {
		CircularLinkedList list = new CircularLinkedList();
		list.addLast();
		list.addLast();
		list.addLast();
		list.display();
		list.addFirst();
		list.addFirst();
		list.display();
		list.addMiddle();
		list.display();
	}
}
