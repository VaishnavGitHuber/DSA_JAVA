/*package LinkedList;
import java.util.Scanner;
//implementation of the doubly Linked List
class Node {
	int data;
	Node next;
	Node prev;
}

public class Practical08 {
	public static void display(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static void reverseDisplay(Node tail) {
		while(tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.prev;
		}
	}
	
	public static Node insertFront(Node head) {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int number =  sc.nextInt();
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null) {
			System.out.println("Node is empty");
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		return head;
		
		
	}
	
	public static Node insertLast(Node tail) {
		Node temp = tail;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int number =  sc.nextInt();
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		newNode.prev = null;
		
		if(tail == null) {
			System.out.println("LL is Empty");
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		return tail;
	}
	
	public static Node insertMiddle(Node head) {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int number =  sc.nextInt();
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null) {
			System.out.println("LInked List is Empty");
		}else {
			System.out.print("Enter the position to enter: ");
			int pos  = sc.nextInt();
			
			for(int i = 0;i < pos-1;i++) {
				temp = temp.next;
			}
			temp.next.prev = newNode;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.prev = temp;
		}
		
		return head;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Node head = null;
		Node tail = null;
		int choice  = 0;
		
		do {
			System.out.print("Enter the data: ");		
			int number = sc.nextInt();
			
			Node newNode = new Node();
			newNode.data = number;
			newNode.next = null;
			newNode.prev = null;
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
			System.out.print("Enter your choice: 1-Continue 2-Exit: ");
			choice = sc.nextInt();
			}while(choice != 2);
		System.out.print("Enter the choice 1-display 2-Reversedisplay 3-insertFront 4-insertLast 5-insertMiddile");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			display(head);
			break;
		case 2:
			reverseDisplay(tail);
			break;
		case 3:
			head = insertFront(head);
			display(head);
			break;
		case 4:
			tail = insertLast(tail);
			display(head);
			break;
		case 5:
			head = insertMiddle(head);
			display(head);
			break;
		}
	}
}*/
