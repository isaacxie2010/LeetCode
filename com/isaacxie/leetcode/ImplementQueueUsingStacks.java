package com.isaacxie.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {
  //https://leetcode.com/problems/implement-queue-using-stacks/
  
  class MyQueue {
    private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	private void refill() {
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
	}
	
	// Push element x to the back of queue.
	public void push(int x) {
		stack2.push(x);
	}

	// Removes the element from in front of queue.
	public int pop() {
		if(stack1.isEmpty()){
			this.refill();
		}
		return stack1.pop();
	}

	// Get the front element.
	public int peek() {
		if(stack1.isEmpty()){
			this.refill();
		}
		return stack1.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
  }

}