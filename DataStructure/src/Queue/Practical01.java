/*package Queue;

import java.util.Scanner;

public class Practical01 {
    static final int SIZE = 10;
    static int[] queue = new int[SIZE];
    static int front = -1, rear = -1;

    public static void enqueue() {
        int element;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the element: ");
        element = input.nextInt();

        if (rear == (SIZE - 1)) {
            System.out.println("Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
        }
    }

    public static void dequeue() {
        if (front == -1) {
            System.out.println("Underflow");
        } else {
            front++;
        }
    }

    public static void display() {
        int i;
        if (front == -1) {
            System.out.println("Empty");
        } else {
            System.out.print("Queue elements: ");
            for (i = front; i <= rear; i++) {
                System.out.print(queue[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the operation to be performed:");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("3 - Display");
            select = input.nextInt();

            switch (select) {
                case 1:
                    enqueue();
                    display();
                    break;
                case 2:
                    dequeue();
                    display();
                    break;
                case 3:
                    display();
                    break;
            }

            System.out.println("\n1 - Continue, 2 - Exit");
            select = input.nextInt();
        } while (select != 2);
    }
}*/
