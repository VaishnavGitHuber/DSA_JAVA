package Sorting;

public class SelectionSort {
	public static void main(String args[]) {
		int[] array = new int[] {2,9,0,1,8};
		int min_index,temp;
		
		// Logical statements
		for(int i = 0;i < array.length-1;i++) {
			min_index = i;
			for(int j = i;j < array.length;j++) {
				if(array[j] < array[min_index]) {
					min_index = j;
				}
			}
			if(min_index != i) {
				temp = array[i];
				array[i] = array[min_index];
				array[min_index] = temp;
			}
		}
		
		// Execution statement
		for(int element: array) {
			System.out.print(element + " ");
		}System.out.println();
	}
}
