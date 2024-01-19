package Stack;
import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class Stack {
	Node head,tail;
	// initialization
	Stack(){
		this.head = null;
		this.tail = null;
	}
	// is Stack empty or not 
	boolean isEmpty() {
		return head == null;
	}
	
	// create a Node 
	Node createNode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}
	
	// push operation
	void push() {
		Node newNode = createNode();
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			System.out.println(tail.data + " is added in to the stack");
		}else {
			tail.next = newNode;
			tail = newNode;
			System.out.println(tail.data + " is added into the stack");
		}
	}
	
	// pop operation 
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!.. Pop operation is not posssible");
		}else {
			System.out.println(tail.data + " is removed from the stack");
			Node temp = head;
			if(head.next == null) {
				head = null;
				tail = null;
			}
			
			while(temp.next.next != null) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		}
	}
	
	// peek operation
	void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!.. peek operation cant be perfromed ");
		}else {
			System.out.println("peek operation: " + tail.data);
		}
	}
	
	// display operation
	void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty!.. display operation cant be perfromed ");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}System.out.println();
		}
	}
}

class Practical02 {
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push();
		stack.push();
		stack.push();
		stack.display();
		stack.pop();
		stack.display();
		stack.peek();
		}
}