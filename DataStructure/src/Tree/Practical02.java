package Tree;
import java.util.Scanner;

class TreeNode {
	int data;
	TreeNode left,right;
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

// implementation of a Binary Search tree 
class Practical02 {
	// Insert data 
	static TreeNode insertData(TreeNode root,int data) {
		if(root == null) {
			return new TreeNode(data);
		}
		
		if(data < root.data) {
			root.left = insertData(root.left,data);
		}else {
			root.right = insertData(root.right,data);
		}
		
		return root;
		}
	
	// inorder Traversal of the tree
	static void inOrderTraversal(TreeNode root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}
	// main function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int data,choice;
		TreeNode root = null;
		do {
			System.out.print("Enter the data: ");
			data = sc.nextInt();
			root = insertData(root,data);
			System.out.print("Enter the choice 1-Continue 2-Exit");
			choice = sc.nextInt();
		}while(choice != 2);
		
		System.out.println("InOrder-Traversal: ");
		inOrderTraversal(root);
	}
}
