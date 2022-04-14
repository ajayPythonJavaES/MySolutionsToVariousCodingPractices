package com.scaler.stack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		
		stack.push(10);
		stack.push(9);
		System.out.println(stack.getMin());
		stack.push(8);
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.push(7);
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.push(6);
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.pop();
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.pop();
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.pop();
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.pop();
		//stack.getMin();
		System.out.println(stack.getMin());
		stack.pop();
		//stack.getMin();
		System.out.println(stack.getMin());
	}
	
	private void push(int data) {
		if(data < min) {
			min = data;
			minStack.push(min);
			//System.out.println(minStack);
		}			
		stack.push(data);
		
	}
	
	private void pop() {	
		if(!stack.isEmpty()) {
			int x = stack.pop();	
			if(x == min) {
				minStack.pop();
				if(!minStack.isEmpty())
					min = minStack.peek();
			}
		}
	}
	
	private int getMin() {
		if(stack.isEmpty())
			return -1;
		return min;
	}
	
	private int top() {		
		return stack.isEmpty() ? -1 : stack.peek();
	}
	
}
