package assignments;

import java.util.Scanner;
import java.util.Stack;

public class balanced_parent {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new Stack<>();
		System.out.println("Enter the String");
		String str = sc.next();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				s.push(str.charAt(i));
			} else if ((str.charAt(i) == ')' && s.peek() == '(') || (str.charAt(i) == '}' && s.peek() == '{')
					|| (str.charAt(i) == ']' && s.peek() == '[')) {
				s.pop();

			}
		}
		if(s.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Un Balanced");
		}

	}

}
