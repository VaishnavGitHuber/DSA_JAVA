/*package Stack;
import java.util.Scanner;

public class Practical01 {
    static final int SIZE = 10;
    static int top = -1;
    static int[] stack = new int[SIZE];

    public static void push() {
        int element;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the element: ");
        element = input.nextInt();

        if (top == (SIZE - 1)) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = element;
        }
    }

    public static void display() {
        if (top != -1) {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + "\t");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top] + " is removed");
            top--;
        }
    }

    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the operation to be performed:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Display");
            select = input.nextInt();

            switch (select) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    break;
            }

            System.out.println("Enter 1 to continue or 2 to exit: ");
            select = input.nextInt();
        } while (select != 2);
    }
}*/
