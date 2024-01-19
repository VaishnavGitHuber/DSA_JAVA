package Questions;//reverse of string

public class Question9 {
	public static String reverseString(String string) {
		char[] charArray = string.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		char temp;
		
		while(start < end) {
			temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			
			start ++;
			end --;
		}
		
		return new String(charArray);
		
	} 

	public static void main(String args[]) {
		String input_string = "Hello World";
		String reversed_string = reverseString(input_string);
		
		System.out.println("Orginal String:"+input_string);
		System.out.println("Reversed String:"+reversed_string);
	}
}
