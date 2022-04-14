package com.scaler.stack;

public class MinStackWithStackImplementation {

	class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	int top = -1;
	Node head = null;
	int min = Integer.MAX_VALUE;

	public void push(int x) {
		if (top == -1 && head == null) {
			head = new Node(x);
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new Node(x);
		}
		top++;
	}

	public void pop() {
		if (head == null && top == -1) {
			return;
		} else {
			Node trav = head;
			Node prev = null;
			while (trav.next != null) {
				prev = trav;
				trav = trav.next;
			}
			if(prev != null)
				prev.next = null;
			else
				head = null;
			top--;
			min = Integer.MAX_VALUE;
		}
	}

	public int top() {
		if (head == null) {
			return -1;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			return trav.data;
		}
	}

	public int getMin() {		
		Node trav = head;
		if (trav == null) {
			min = -1;
		} else {
			while (trav != null) {
				if (trav.data < min)
					min = trav.data;
				trav = trav.next;
			}
		}
		//System.out.println(min);
		return min;
	}

	public static void main(String[] args) {
		MinStackWithStackImplementation stack = new MinStackWithStackImplementation();
		
		stack.push(10);
		stack.push(9);
		System.out.println(stack.getMin());
		stack.push(8);
		System.out.println(stack.getMin());
		stack.push(7);
		System.out.println(stack.getMin());
		stack.push(6);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}
	
	
}
