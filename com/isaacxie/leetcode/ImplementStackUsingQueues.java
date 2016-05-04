package com.isaacxie.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {
	private Queue<Integer> queue1 = new LinkedList<Integer>();
	private Queue<Integer> queue2 = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		queue1.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		while (queue1.size() > 1) {
			queue2.add(queue1.remove());
		}
		queue1.remove();
		Queue<Integer> temp = queue2;
		queue2 = queue1;
		queue1 = temp;
	}

	// Get the top element.
	public int top() {
		while (queue1.size() > 1) {
			queue2.add(queue1.remove());
		}

		int top = queue1.peek();
		queue2.add(queue1.remove());

		Queue<Integer> temp = queue2;
		queue2 = queue1;
		queue1 = temp;

		return top;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue1.isEmpty();
	}
}
