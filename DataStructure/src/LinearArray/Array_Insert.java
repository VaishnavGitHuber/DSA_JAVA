package LinearArray;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Insert {
	
	public static int[] insert_element(int number,int size,int pos,int[] myArray) {
		int[] myNewArray = new int[size+1];
		
		for (int i = 0;i < myNewArray.length;i++) {
			if(i < pos-1) {
				myNewArray[i] = myArray[i];
			}else if(i == pos-1){
				myNewArray[i] = number;
			}else {
				myNewArray[i] = myArray[i - 1];
			}
		}
		
		return myNewArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] myArray = new int[] {1,2,3,4,5};
		
		System.out.println("Enter number to be inserted");
		int number = sc.nextInt();
		System.out.println("Enter position to be inserted");
		int pos = sc.nextInt();
		
		int size = myArray.length;
		
		System.out.println("Array before Insertion");
		System.out.println(Arrays.toString(myArray));
		
		int[] myNewArray = insert_element(number,size,pos,myArray);
		
		System.out.println("Array after Insertion");
		System.out.println(Arrays.toString(myNewArray));

	}

}
