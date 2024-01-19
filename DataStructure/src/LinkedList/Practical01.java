/*package LinkedList;  //by chatGpt
import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class Practical01 {
    public static void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static Node addFirst(Node head) {
        Node new_Node = new Node();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for LL: ");
        int value = scanner.nextInt();
        new_Node.data = value;
        new_Node.next = head;
        head = new_Node;

        display(head);

        return head;
    }

    public static Node addLast(Node tail) {
        Node new_Node = new Node();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for LL: ");
        int value = scanner.nextInt();
        new_Node.data = value;
        new_Node.next = null;

        tail.next = new_Node;
        tail = new_Node;

        return tail;
    }

    public static Node addMiddle(Node temp) {
        Node head = temp;
        Node new_Node = new Node();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value and position to add: ");
        int value = scanner.nextInt();
        int pos = scanner.nextInt();

        new_Node.data = value;
        new_Node.next = null;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        new_Node.next = temp.next;
        temp.next = new_Node;

        display(head);
        return head;
    }

    public static Node delFirst(Node head) {
        head = head.next;

        display(head);

        return head;
    }

    public static Node delLast(Node temp) {
        Node head = temp;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        display(head);

        return head;
    }

    public static Node delMiddle(Node temp) {
        Node head = temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position to delete: ");
        int pos = scanner.nextInt();

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        display(head);
        return head;
    }

    public static void main(String[] args) {
        Node new_Node = null;
        Node head = null;
        Node tail = null;
        int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            new_Node = new Node();
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            new_Node.data = value;
            new_Node.next = null;

            if (head == null) {
                head = new_Node;
                tail = new_Node;
            } else {
                tail.next = new_Node;
                tail = new_Node;
            }

            System.out.print("Enter choice (1-continue, 2-Exit): ");
            choice = scanner.nextInt();
        } while (choice != 2);

        do {
            System.out.println("Enter the operation to perform:");
            System.out.println("1-display\n2-AddFirst\n3-AddLast\n4-addMiddle\n5-delFirst\n6-delLast\n7-delMiddle");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    display(head);
                    break;
                case 2:
                    head = addFirst(head);
                    break;
                case 3:
                    tail = addLast(tail);
                    break;
                case 4:
                    head = addMiddle(head);
                    break;
                case 5:
                    head = delFirst(head);
                    break;
                case 6:
                    head = delLast(head);
                    break;
                case 7:
                    head = delMiddle(head);
                    break;
            }

            System.out.print("\nEnter the ending press (1-continue, 2-exit): ");
            choice = scanner.nextInt();
        } while (choice != 2);
    }
}*/
