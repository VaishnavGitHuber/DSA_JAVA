/*package Queue;//queue over by own
import java.util.Scanner;

public class Practical02 {
	static final int size = 10;
	static int front = -1,rear = -1;
	static int[] queue = new int[size];
	
	static void enqueue() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to add");
		int data = sc.nextInt();
		
		if(rear == size-1) {
			System.out.println("Queue is empty");
		}else {
			if(front == -1) {
				front = 0;
			}
			rear ++;
			queue[rear] = data;
		}
		
	}
	
	public static void dequeue() {
		if (front == -1) {
			System.out.println("Queue is empty");
		}else {
			front ++;
		}
	}
	
	public static void display() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}else {
			for(int i = front;i <= rear;i++) {
				System.out.print(queue[i]+ " ");
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\nEnter the choice 1-enqueue 2-dequeue 3- display");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				enqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			}
		
			System.out.println("1 - continue 2- exit");
			choice = sc.nextInt();
		}while(choice != 2);
	}
}
*/