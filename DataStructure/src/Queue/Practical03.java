package Queue;

import java.util.Scanner;

class Queue {
	// initialization
	int front,rear,size;
	int[] queue;
	Queue(int size){
		this.front = 0;
		this.rear = -1;
		queue = new int[size];
		this.size = size;
	}
	
	// whether the queue is empty or not
	boolean isEmpty() {
		return front > rear;
	}
	
	// whether the queue is full or not 
	boolean isFull() {
		return rear == size-1;
	}
	
	// insert data from the user 
	int askUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data: ");
		int data = sc.nextInt();
		return data;
	}
	
	
	// enqueue operation 
	void enqueue() {
		if(isFull()) {
			System.out.println("Enqueue operation cant be done");
		}else {
			rear++;
		    int data = askUser();
		    System.out.println(data + " is added to the queue");
		    queue[rear] = data;
		}
	}
	
	// dequeue operation
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Dequeue operation cant be done");
		}else {
			System.out.println(queue[front] + " is removed from the queue");
			front++;
		}
	}
	
	
	// void peek 
	void peek() {
		if(isEmpty()) {
			System.out.println("peek operation cant be done");
		}else {
			System.out.println("peek operation: "+ queue[front]);
		}
	}
	
	// displaty a queue Ds
	void display() {
		if(isEmpty()) {
			System.out.println("display operation cant be done");
		}else {
			for(int i = front;i <= rear;i++) {
				System.out.print(queue[i] + " ");
			}System.out.println();
		}
	}
}

class Practical03 {
	public static void main(String args[]) {
		int size = 10;
		Queue queue = new Queue(10);
		queue.enqueue();
		queue.enqueue();
		queue.enqueue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.peek();
	}
}