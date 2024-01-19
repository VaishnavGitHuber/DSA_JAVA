//implementation of Reversing of SinglyLinkedList
/*
package LinkedList;
import java.util.Scanner;


class Node {
	int data;
	Node next;
}

class Practical07 {
	
	public static Node reversedLinkedList(Node head) {
		Node current = head;
		Node next = null;
		Node prev = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
		
	}
	
	public static void display(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0,number = 0;
		Node head = null,tail = null;
		Node reversed;
		
		do {
			System.out.print("Enter the element: ");
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
			}
			
			System.out.print("enter the choice: 1-C 2-E ");
			choice = sc.nextInt();
		}while(choice != 2);
		
		System.out.println("Orginal List");
		display(head);
		System.out.println();
		
		reversed = reversedLinkedList(head);
		System.out.println("Reversed List");
		display(reversed);
	}
}*/