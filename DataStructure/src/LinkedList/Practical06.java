/*package LinkedList;//Double Linked List
import java.util.Scanner;

class Node {
	Node prev;
	int data;
	Node next;
}

public class Practical06 {
	public static Node addLast(Node tail) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = sc.nextInt();
		Node newNode = new Node();
		newNode.prev = null;
		newNode.data = number;
		newNode.next = null;
		
		if(tail == null) {
			System.out.print("LL is empty");
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		return tail;
	}
	
	public static Node addFirst(Node head) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = sc.nextInt();
		Node newNode = new Node();
		newNode.prev = null;
		newNode.data = number;
		newNode.next = null;
		
		if(head == null) {
			System.out.println("LL is Empty");
			head = newNode;
		}else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		
		return head;
	}
	
	public static void displayRev(Node tail) {
		while(tail != null) {
			System.out.print(tail.data + "->");
			tail = tail.prev;
		}System.out.println("NULL");
	}
	
	public static void display(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}System.out.println("NULL");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Node head = null,tail = null;
		int choice;
		
		do {
			
		System.out.print("Enter the number ");
		int number = sc.nextInt();
		Node newNode = new Node();
		newNode.prev = null;
		newNode.data = number;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.print("Enter the choice 1-continue 2-Exit");
		choice = sc.nextInt();
		}while(choice != 2);
		
		//display(head);
		//displayRev(tail);
		//head = addFirst(head);
		//tail = addLast(tail);
		//display(head);
	}

}*/
