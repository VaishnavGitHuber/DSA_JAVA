package Stack;
import java.util.Scanner;


class StackOperation{
	int size,top = -1;
	int[] stack;
	// constructor
	StackOperation(int size){
		this.size = size;
		stack = new int[size];
	}
	
	// taking element from the user 
	int insertElement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		return data;
	}
	
	//push operation
	void push() {
		System.out.println("Push Operation");
		if(top == size-1) {
			System.out.println("Stack is Full");
		}else {
			top++;
			stack[top] = insertElement();
			System.out.println(stack[top] + " is added into the stack");
		}
	}
	
	// pop operation
	void pop() {
		System.out.println("Pop Operation");
		if(top == -1) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println(stack[top] + " is removed from stack");
			top --;
		}
	}
	
	// peek operation
	void peek() {
		System.out.println("Peek operation");
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("peek: "+ stack[top]);
		}
	}
	
	// display
	void display() { 
		System.out.println("Display: Stack");
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			for(int i = 0;i <= top;i++) {
				System.out.print(stack[i] + " ");
			}System.out.println();
		}
	}
}


public class PushPopPeek {
	public static void main(String args[]) {
		StackOperation stack = new StackOperation(10);
		stack.push();
		stack.push();
		stack.push();
		stack.pop();
		stack.display();
	}
}

