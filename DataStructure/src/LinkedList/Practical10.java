/*package LinkedList;//implementation of Linked List and all operations by using different class
import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LLOperation{
	Node head = null,tail = null;
	
	public void createLinkedList() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int choice = 0;
		
		do {
		System.out.print("Enter the data to insert: ");
		number = sc.nextInt();
		Node newNode = new Node(number);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		System.out.print("Enter the choice 1-C 2-E");
		choice = sc.nextInt();
	}while(choice != 2);
	}
	
	
	public void displayLinkedList() {
		Node temp = head;
		if(temp == null) {
			System.out.println("LinkedList is Empty");
		}else {
			System.out.println("Linked List");
			while(temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}System.out.print("NULL");
			System.out.println();
		}
	}
	
	public void addFirst() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter the data to insert: ");
		number = sc.nextInt();
		Node newNode = new Node(number);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addLast() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter the data to insert: ");
		number = sc.nextInt();
		Node newNode = new Node(number);
		
		if(tail == null) {
			tail = newNode;
			head = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void addMiddle() {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		int number = 0,pos = 0;
		System.out.print("Enter the data to insert: ");
		number = sc.nextInt();
		System.out.print("Enter the position to insert: ");
		pos = sc.nextInt();
		Node newNode = new Node(number);
		
		for(int i = 0;i < pos-1;i++) {
			temp = temp.next;
		}newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void delFirst() {
		if(head == null) {
			System.out.println("Linked List is Empty");
			return;
		}else {
			head = head.next;
		}
	}
	
	public void delLast() {
		Node temp = head;
		if(head == null) {
			System.out.println("Linked List is empty");
			return ;
		}
		else if(temp.next == null){
			head = null;
		}
			else {
			
			while(temp.next.next != null) {
				temp = temp.next;
			}temp.next = null;
		}
			
		}
	
	public void delMiddle() {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position to delete: ");
		int pos = sc.nextInt();
		
		if(head == null) {
			System.out.println("Linked List is Empty");
		}else {
			for(int i = 0;i < pos-1;i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	}


public class Practical10 {
	public static void main(String args[]) {
		LLOperation l1 = new LLOperation();
		l1.createLinkedList();
		//l1.displayLinkedList();
		//l1.addFirst();
	//l1.addLast();
		//l1.displayLinkedList();
		//l1.addMiddle();
		//l1.displayLinkedList();
		//l1.delLast();
		//l1.displayLinkedList();
		//l1.delFirst();
		l1.displayLinkedList();
		l1.delMiddle();
		l1.displayLinkedList();
	}
}*/
