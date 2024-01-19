/*package Searching;

public class BinarySearch {
	public static void main(String args[]) {
		// initialization
		int[] array = new int[] {1,9,10,13,99};
		int key = 99;
		int l = 0,r = array.length-1,mid;
		boolean found = false;
		
		// Logical statements 
		while(l <= r) {
			mid = (l+r)/2;
			if(array[mid] == key) {
				found = true;
				break;
			}
			if(key < array[mid]) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		
		// Execution staments
		if(found) {
			System.out.println("Search key is found");
		}else {
			System.out.println("Search key not found");
		}
	}
}
*/