package Questions;//reversing the array

public class Question7 {
	
	public static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int temp = 0;
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start ++;
			end --;
		}
		
		return arr;
	}
	public static void main(String args[]) {
		int[] myArray = {1,2,3,4,5,6,7};
		int[] revArray = reverseArray(myArray);
		
		System.out.println("Reversed Array");
		for (int x: revArray) {
			System.out.print(x + " ");
		}System.out.println();
	}
}
