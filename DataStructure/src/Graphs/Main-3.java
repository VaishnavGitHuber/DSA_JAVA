import java.util.Scanner;

class
 
TreeNode
 
{
  int data;
  TreeNode left, right;

  TreeNode(int data) {
    this.data = data;
    left = right = null;
  }
}

class Main {
  // Creating a tree node function
  static TreeNode createNode(int data) {
    TreeNode newNode = new TreeNode(data);
    return newNode;
  }

  // Traversing a tree using in-order traversal
  static void
 
inorderTraversal(TreeNode root)
 
{
    if (root != null) {
      inorderTraversal(root.left);
      System.out.print(root.data + " ");
      inorderTraversal(root.right);
    }
  }

  // Inserting data into a binary search tree
  static TreeNode insertData(TreeNode root, int data) {
    if (root == null) {
      root = createNode(data);
    }

    if (data < root.data) {
      root.left = insertData(root.left, data); // Correction: Replace `insertData(root.right, data);` with `insertData(root.left, data);`
    } else
 
if (data > root.data) {
      root.right = insertData(root.right, data);
    }

    return root;
  }

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the data for the root node: ");
    int data = sc.nextInt();
    int choice;
    TreeNode root = new TreeNode(data);
    do {
      System.out.print("Enter the data: ");
      data = sc.nextInt();
      root = insertData(root, data);
      System.out.print("Enter the choice: 1- Exit 2-Continue");
      choice = sc.nextInt();
    } while (choice != 2);

    System.out.println("In-order traversal: ");
    inorderTraversal(root);

    // Printing the root node and its children
    System.out.println("\nroot.data = " + root.data);
    System.out.println("root.left = " + root.left.data);
    System.out.println("root.right = " + root.right.data);
  }
}