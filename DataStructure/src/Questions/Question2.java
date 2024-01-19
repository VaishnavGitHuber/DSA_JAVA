package Questions;//other way of Question 1
//import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
//import java.util.ArrayList;


class Question2{
	public static void findDuplicates(int[] myArray) {
		HashSet<Integer> set = new HashSet<>();
		TreeSet<Integer> duplicate_set = new TreeSet<>();
		
		for(int x: myArray) {//for each loop for iterating
			if(!set.add(x)) {//checking condition
				duplicate_set.add(x);//duplicates list
			}
		}
		if (duplicate_set.size() == 0) {
			System.out.println("NO Dupicates");
		}
		else {
		for(int x: duplicate_set) {
			
			System.out.print(x+" ");
		}
		}
	
	}
	
	
	public static void main(String args[]) {
		int[] myArray = new int[] {23,23,3,3,3,5,6,1,1,45,67,87,87,2};
 		findDuplicates(myArray);
 		
 		
	}
}