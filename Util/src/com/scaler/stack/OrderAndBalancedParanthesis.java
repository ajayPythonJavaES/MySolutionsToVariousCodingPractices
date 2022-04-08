package com.scaler.stack;

import java.util.Stack;

public class OrderAndBalancedParanthesis {

	public static void main(String[] args) {
		System.out.println(solve("(){}[]"));
		System.out.println(solve("{{{([()])}}}"));
		//System.out.println(new StringBuffer("{}").reverse());
	}

	public static int solve(String A) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < A.length(); i++) {
			switch (A.charAt(i)) {
			case '{':
				stack.push('{');
				break;
			case '}':
				if(!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					return 0;					
				break;
			case '(':
				stack.push('(');
				break;
			case ')':
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return 0;					
				break;
			case '[':
				stack.push('[');
				break;
			case ']':
				if(!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return 0;					
				break;
			}
		}
		if(stack.isEmpty())
			return 1;
		else
			return 0;
	}

}
