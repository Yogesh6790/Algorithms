package com.algorithms.string;

import java.util.Stack;

//Stack could be used for this
public class BalancedParanthesis {

	public static void main(String[] args) {
		
//		String x = "[()]{}{[()()]()}";
		String x = "[(])";
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		for(Character c : x.toCharArray()){
			if(c == '(' || c ==	'{' || c == '['){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					flag = false;
					break;
				}
				Character now = stack.pop();
				if(c == ')' && now != '('){
					flag = false;
					break;
				}
				if(c == ']' && now != '['){
					flag = false;
					break;					
				}
				if(c == '}' && now != '{'){
					flag = false;
					break;					
				}
			}
		}
		
		if(flag && stack.isEmpty()){
			System.out.println("Balanced");
		}else{
			System.out.println("Unbalanced");
		}
	}

}
