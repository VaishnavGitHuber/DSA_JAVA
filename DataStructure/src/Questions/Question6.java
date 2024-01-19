/*package Questions;
import java.util.Scanner;
//Linked List programmed to find the intersection of the Linked List
class Node {
	int data;
	Node next;
}

class LinkedListOperation{
	
	public void display(Node head) {
		while(head != null) {
		  System.out.print(head.data + "->");
		  head = head.next;
		}System.out.println("NULL");
	}
	
	public Node findintersectionNode(Node head1,Node head2) {
		if(head1 == null || head2 == null) {
			return null;
		}
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1 != null) {
			while(temp2 != null) {
				if(temp1.data == temp2.data) {
					return temp1;
				}
				temp2 = temp2.next;
			}temp2 = head2;
			temp1 = temp1.next;
		}
		
		return null;
	}
	
	public Node createLL() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Node head = null,tail = null;
		
		do {
		System.out.print("Enter the data: ");
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
		System.out.print("Enter the choice 1-C 2-E: ");
		choice = sc.nextInt();
		}while(choice != 2);
		
		
		return head;
	}
}


public class Question6 {
	public static void main(String args[]) {
		LinkedListOperation l1 = new LinkedListOperation();
		Node head1 = l1.createLL();
		Node head2 = l1.createLL();
		System.out.println();
		l1.display(head1);
		l1.display(head2);
		
		System.out.println();
		
		Node intersection = l1.findintersectionNode(head1, head2);
		System.out.print("first Intersectiondata: "+intersection.data);
	}
}
*/