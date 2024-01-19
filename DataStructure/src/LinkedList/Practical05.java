/*package LinkedList;//queue using LL
import java.util.Scanner;

 class Node{
	int data;
	Node next;
}



public class Practical05 {
	
	public static Node dequeue(Node head) {
		
		if(head == null) {
			System.out.print("Queue is Empty");
		}else {
			head = head.next;
		}
		
		return head;
	}
	
	
	public static Node enqueue(Node head) {
		Scanner sc = new Scanner(System.in);
		Node temp = head;
		
		System.out.println("Enter elements to enqueue");
		int number = sc.nextInt();
		
		 Node newNode = new Node();
		
		newNode.data = number;
		newNode.next = null;
		
		if(temp == null) {
			System.out.print("Stack is Empty");
			temp = newNode;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}temp.next = newNode;
			
		}
		
		return head;
	}
	
	public static void display(Node head) {
		if(head == null) {
			System.out.print("Stack is Empty");
		}else {
			while(head != null) {
				System.out.print(head.data + "->");
				head = head.next;
			}System.out.println("NULL");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Node head = null,tail = null;
		int choice;
		
		do {
		System.out.print("Enter the number to enter ");
		int number = sc.nextInt();
		
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
		System.out.print("Enter the choice(1-continue 2- Exit)");
		choice = sc.nextInt();
		
		}while(choice != 2);
		

		do {
			System.out.print("Enter the choice 1- display 2-enqueue 3 - dequeue");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				display(head);
				break;
			case 2:
				head = enqueue(head);
				display(head);
				break;
			case 3:
				head = dequeue(head);
				display(head);
				break;
			default:
				System.out.print("Enter Correct key");
				break;
			
			}
			System.out.print("Enter the choice 1- continue 2- Exit");
			choice = sc.nextInt();
		}while(choice != 2);
	}

}
*/