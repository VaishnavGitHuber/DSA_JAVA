//Given an array a of size N which contains elements from 0 to N-1, 
//you need to find all the elements occurring more than once in the given array.
//Return the answer in ascending order. If no such element is found, return list containing [-1]. 


//Expected time complexity -> o(n)
//Expected auxiliary time complexity -> o(n)


package Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Question1 {
    public static int[] findAndReturnDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        
        for (int num : arr) {
            if (!set.add(num)) {
                // If the element is already in the set, it's a duplicate
                duplicateList.add(num);
            }
        }
        
        // Convert the List of duplicates to an array
        int[] duplicates = new int[duplicateList.size()];
        for (int i = 0; i < duplicateList.size(); i++) {
            duplicates[i] = duplicateList.get(i);
        }
        
        // Sort the duplicates array in increasing order
        Arrays.sort(duplicates);
        
        return duplicates;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 2, 4, 5, 5, 6,1};
        int[] duplicates = findAndReturnDuplicates(myArray);

        if (duplicates.length == 0) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicate elements in the array (sorted): ");
            for (int num : duplicates) {
                System.out.print(num + " ");
            }
            System.out.println(); // Print a new line
        }
    }
}

//Arrays and Strings:
//1. Reverse an Array: Write a function to reverse an array in-place.
//2. String Reversal: Implement a function to reverse a string.
//3. Find the Missing Number: Given an array of integers from 1 to N, find the missing number.
//4. Find Duplicates: Find duplicates in an array of integers.
//5. Anagram Detection: Determine if two strings are anagrams of each other.
