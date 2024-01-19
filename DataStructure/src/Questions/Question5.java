/*package Questions;

import java.util.Stack;

// reversing the first k elements of the array

public class Question5 {
	public static void main(String args[]) {
		Queue queue = new Queue(6);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.display();
		
		queue.reverseKElements(3);
		System.out.println();
		queue.display();
	}
	
}
	



class Queue {
	int max;
	int[] queue;
	int front,rear;
	
	Queue(int size){
		max = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	public void enqueue(int data) {
		if(front == -1) {
			front = 0;
		}
		rear ++;
		queue[rear] = data;
	}
	
	
	public void display() {
		if(rear == front-1) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i = front;i <= rear;i++) {
				System.out.print(queue[i] + " ");
			}
		}
	}
	
	public void reverseKElements(int k) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0;i < k;i++) {
			stack.add(queue[i]);
 		}
		
		for(int i = 0;i < k;i++) {
			queue[i] = stack.pop();
		}
		
	}

}*/