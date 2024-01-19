package Questions;
import java.util.Arrays;
//Anagram Detection - Arrays 
public class Question10 {
	public static boolean checkAnagram(String str1,String str2) {
		str1 = str1.replaceAll("\\s","").toLowerCase();
		str2 = str2.replaceAll("\\s","").toLowerCase();
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		if(charArray1.length != charArray2.length) {
			return false ;
		}
		
		Arrays.sort(charArray1);//internal sorting
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1,charArray2);
		
	}
	
	public static void main(String args[]) {
		String str1 = "listen";
		String str2 = "silent";
		
		if(checkAnagram(str1,str2)) {
			System.out.print(str1 + " and " + str2 + " is anagram");
		}else {
			System.out.print("Not anagram");
		}
	}
}
