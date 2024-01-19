/*package LinkedList;//implementation of the circular linked list
import java.util.Scanner;

class Node {
	int data;
	Node next;
}

public class Practical09 {
	
	public static Node delMiddle(Node head) {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position to delete: ");
		int pos = sc.nextInt();
		
		for(int i = 0;i < pos-1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
		
		return head;
	}
	
	public static Node delLast(Node head) {
		Node temp = head;
		if(head == null) {
			System.out.println("NULL");
		}else {
			while(temp.next.next != head) {
				temp = temp.next;
			}temp.next = head;
		}
		
		return head;
	}
	
	public static Node delFirst(Node head) {
		Node temp = head;
		
		 if(head == null) {
			 System.out.print("Head is NULL");
		 }else {
			 while(temp.next != head) {
				 temp = temp.next;
			 }
			 
			 head = head.next;
			 temp.next = head;
		 }
		 
		 return head;
	}
	
	
	public static Node addMiddle(Node head) {
		Scanner sc = new Scanner(System.in);
		int number;
		Node temp = head;
		System.out.print("Enter the number to adddMiddle: ");
		number = sc.nextInt();
		System.out.print("Enter the position: ");
		int pos = sc.nextInt();
		Node newNode = new Node(); 
		newNode.data = number;
		newNode.next = null;
		
		for(int i = 0;i < pos-1;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		
		return head;
	}
	
	public static Node addLast(Node tail) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter the number to addLast: ");
		number = sc.nextInt();
		Node newNode = new Node(); 
		newNode.data = number;
		newNode.next = null;
		
		if(tail == null) {
			tail = newNode;
		}else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		
		return tail;
	}
	
	public static Node addFront(Node temp) {
		Scanner sc = new Scanner(System.in);
		int number;
		Node head = temp;
		System.out.print("Enter the number to addFront: ");
		number = sc.nextInt();
		Node newNode = new Node(); 
		newNode.data = number;
		newNode.next = null;
		
		
		while(temp.next != head) {
			temp = temp.next;
		}
		newNode.next = head;
		head = newNode;
		temp.next = head;
		
		return head;
		
		
	}
	
	public static void display(Node head) {
		if (head == null) {
			System.out.print("NULL");
			return;
		}
		if(head.next == null) {
			System.out.print(head.data + "-> NULL");
			return;
		}
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}System.out.print(temp.data + "-> NULL");
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null,tail = null;
		int number = 0,choice = 0;
		
		do {
		
		System.out.print("Enter the data to enter: ");
		number = sc.nextInt();
		Node newNode = new Node();
		newNode.data = number;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}
		System.out.print("Enter the choice: ");
		choice = sc.nextInt();
		
		} while(choice != 2);
		
		display(head);
		System.out.println();
		//head = addFront(head);
		//tail = addLast(tail);
		//head = addMiddle(head);
		//head = delFirst(head);
		//head = delLast(head);
		//head = delMiddle(head);
		System.out.println();
		display(head);
		
	}
}*/
