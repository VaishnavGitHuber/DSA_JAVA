/*package Tree;//completed tree
import java.util.Scanner;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
}

public class Practical01 {
	public static void inorderTraversal(TreeNode root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}
	}
	public static void preorderTraversal(TreeNode root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	public static void postorderTraversal(TreeNode root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static TreeNode createNode(int number) {
		TreeNode newNode = new TreeNode();
		newNode.data = number;
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
	
	public static TreeNode insert(TreeNode root,int number) {
		if(root == null) {
			return createNode(number);
		}
		if(number < root.data) {
			root.left = insert(root.left,number);
		}else if(number > root.data) {
			root.right = insert(root.right,number);
		}
		
		return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeNode root = null;
		int choice ,number;
		
		do {
		System.out.print("Enter the number to add; ");
		number = sc.nextInt();
		root = insert(root,number);
		System.out.print("Enter your choice 1-Continue 2-Exit");
		choice = sc.nextInt();
		}while(choice != 2);
		
		System.out.print("Inorder Traversal: ");
		inorderTraversal(root);
		System.out.println();
		System.out.print("PreOrder Traversal: ");
		preorderTraversal(root);
		System.out.println();
		System.out.print("postOrder Traversal: ");
		postorderTraversal(root);
		System.out.println();
	}

}*/
