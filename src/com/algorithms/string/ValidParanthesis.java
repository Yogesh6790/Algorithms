package com.algorithms.string;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParanthesis {

	public static void main(String args[]) {
		String str = "()[]{}";
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			Character currentChar = str.charAt(i);
			if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(currentChar);
			} else {
				if (!stack.isEmpty()) {
					Character top = stack.peek();
					if ((currentChar == ')' && top == '(')
							|| (currentChar == '}' && top == '{')
							|| (currentChar == ']' && top == '[')) {
						stack.pop();
					} else {
						flag = false;
						break;
					}
				} else {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag && stack.isEmpty()); // valid
	}

}
