/*package Questions;
//finding the middle of the LL if odd it works properly if even it gives the second middle number 

import java.util.Scanner;

class Node {
	int data;
	Node next;
}

class Question4 {
	static int choice;
	
	public static Node delMiddle(Node head) {
		Scanner sc = new Scanner(System.in);
		
		Node temp = head;
		System.out.println("Enter the position to delete");
		int pos = sc.nextInt();
		
		for(int i = 0;i < pos-2;i++) {
			temp = temp.next;
		}temp.next = temp.next.next;
		
		
		display(head);
		
		return head;
		
	}
	
	
	public static Node delLast(Node head) {
		Node temp = head;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
		display(head);
		
		return head;
	}
	
	public static Node delFirst(Node head) {
		head = head.next;
		
		display(head);
		return head;
	}
	
	public static Node addLast(Node head) {
		Scanner sc = new Scanner(System.in);
		Node temp = head;
		
		System.out.println("Enter elements");
		int number = sc.nextInt();
		
		 Node newNode = new Node();
		
		newNode.data = number;
		
		while(temp.next != null) {
			temp = temp.next;
		}temp.next = newNode;
		
		
		display(head);
		
		return head;
		
		
	}
	
	public static void display(Node head) {
		if(head == null) {
			System.out.println("Linked List is Empty");
		}else {
			while(head != null) {
				System.out.print(head.data + "->");
				head = head.next;
			}System.out.print("NULL");
		}
	}
public static int findMiddle(Node head) {
	Node fastptr = head;
	Node slowptr = head;
	Node middle1 = null;
	Node middle2 = null;
	
	if(head == null) {
		return -1;
	}
	
	while(fastptr != null && fastptr.next != null) {
		
		
		slowptr = slowptr.next;
		fastptr = fastptr.next.next;
	}
	
	return slowptr.data;
}
	
	public static Node addFirst(Node head) {
		Scanner sc = new Scanner(System.in);
		
		Node newNode = new Node();
		
		System.out.print("Enter the number to add: ");
		int number = sc.nextInt();
		
		newNode.data = number;
		newNode.next = head;
		head = newNode;
		
		display(head);
		return head;
	}
	
	public static Node addMiddle(Node head) {
		Node temp = head;
		Scanner sc = new Scanner(System.in);
		
		Node newNode = new Node();
		
		System.out.println("Enter the number and pos to add ");
		int number = sc.nextInt();
		int pos = sc.nextInt();
		newNode.data = number;
		newNode.next = null;
		
		for(int i = 0;i < pos-2;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		
		display(head);
		return head;
		
	}
	
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		Node head = null,tail = null;//declaration and initialization head and tail
		
		
		do {
		System.out.println("Enter the value to insert: ");//inserting the value to add in linked list
		int number = sc.nextInt();
		
		Node newNode = new Node();//declaration of the new node
		newNode.data = number;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
		    tail.next = newNode;
		    tail = newNode;
		}
		System.out.print("1 - Continue , 2 - Exit");
		choice = sc.nextInt();
		}while(choice != 2);
		
		//System.out.println("Bofore operation");
		//display(head);
		//System.out.println("\nAfter operation");
		
		display(head);
		//head = addFirst(head);
		//head = addLast(head);
		//head = addMiddle(head);
		//head = delFirst(head);
		//head = delLast(head);
		//head = delMiddle(head);
		System.out.println();
		System.out.print("Middle element ");
		int middleValue = findMiddle(head);
		System.out.print(middleValue);
		
	}
}*/

