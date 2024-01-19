package LinearArray;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Delete {
	
	public static int[] delete_element(int pos,int size,int[] myArray) {
		int[] myNewArray = new int[size -1];
		
		for(int i = 0;i < myNewArray.length;i++) {
			if(i < pos-1) {
				myNewArray[i] = myArray[i];
			}else {
				myNewArray[i] = myArray[i+1];
			}
		}
		return myNewArray;
	}
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] myArray = new int[] {1,2,3,4,5};
		
		System.out.println("Enter position to be deleted");
		int pos = sc.nextInt();
		
		System.out.println("Array before Insert");
		System.out.println(Arrays.toString(myArray));
		
		int[] myNewArray = delete_element(pos,myArray.length,myArray);
		
		System.out.println("Array after Insert");
		System.out.println(Arrays.toString(myNewArray));
		
		
	}
}
