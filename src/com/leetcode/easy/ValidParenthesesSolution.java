package com.leetcode.easy;

import java.util.Stack;

public class ValidParenthesesSolution {

	public boolean isValid(String s) {

		// if(s.isEmpty || s.length == 1){
		// return false;
		// }

		// new commentjfaksdjflkaj

		Stack<Character> stack = new Stack<>();
		char[] charStr = s.toCharArray();

		for (char c : charStr) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;

				char ob = stack.pop();
				if ((ob == '(' && c == ')') || (ob == '{' && c == '}') || (ob == '[' && c == ']'))
					continue;
				else
					return false;
			}

		}

		if (!stack.isEmpty()) {
			return false;
		} else
			return true;
	}
}
