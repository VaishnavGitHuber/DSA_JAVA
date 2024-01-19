package Sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int[] array = new int[]{2,0,9,7,3,1,10,8};
		int temp,j;
		
		// Logical statements 
		for(int i = 1;i < array.length;i++) {
			j = i-1;
			while(j >= 0) {
				if(array[j+1] < array[j]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
				j -= 1;
			}
		}
		
		// Execution statements 
		for(int element: array) {
			System.out.print(element + " ");
		}System.out.println();
	}
}
