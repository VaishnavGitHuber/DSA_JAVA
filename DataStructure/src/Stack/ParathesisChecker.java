package Stack;
import java.util.Scanner;
import java.util.Stack;

public class ParathesisChecker {
	static boolean paranthesisChecker(String expression){
		Stack<Character> stack = new Stack<>();
		char[] expArray = expression.toCharArray();
		char[][] mappings = {{'}','{'},{']','['},{')','('}};
		char topElement = '#';
		
		for(char exp : expArray) {
			boolean isClosingParanthesis = false;
			char correspondingClosing = '#';
			
			for(char[] map:mappings) {
				if(map[0] == exp) {
					isClosingParanthesis = true;
					correspondingClosing = map[1];
					break;
				}
			}
			
			if(isClosingParanthesis) {
				topElement = stack.isEmpty() ? '#' : stack.pop();
				if(correspondingClosing != topElement) {
					return false;
				}
			}else {
				stack.push(exp);
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String expression = sc.next();
		System.out.println(paranthesisChecker(expression) ? "Balanced" : "NotBalanced");
	}
}
