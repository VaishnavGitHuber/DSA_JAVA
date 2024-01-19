package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Practical03 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        int select;

        do {
            System.out.println("Enter the operation to be performed:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Display");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter the element: ");
                    int element = input.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println(poppedElement + " is removed");
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.print("Stack elements: ");
                        for (Integer item : stack) {
                            System.out.print(item + "\t");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                default:
                    break;
            }

            System.out.println("Enter 1 to continue or 2 to exit: ");
            select = input.nextInt();
        } while (select != 2);
    }
}
