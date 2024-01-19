package Questions;
//Find the Missing Number: Given an array of integers from 1 to N, find the missing number.


public class Question8 {
	public static int findMissing(int[] arr,int n) {
		int expected_sum = (n * (n + 1)) / 2;
		
		int actual_sum = 0;
		
		for (int x:arr) {
			actual_sum += x;
		}
		
		return expected_sum - actual_sum;
	}
	public static void main(String[] args) {
		int[] input_array = {1,3,4,5};
		int N = 5;
		int missing_number = findMissing(input_array,N);
		
		System.out.println("Missing Number is : " + missing_number);

	}

}
