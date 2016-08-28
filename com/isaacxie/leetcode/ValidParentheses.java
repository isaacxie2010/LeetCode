package com.isaacxie.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	// http://oj.leetcode.com/problems/valid-parentheses/

	public boolean isValid(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put(')', '(');
		hm.put(']', '[');
		hm.put('}', '{');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				if (!stack.isEmpty() && stack.peek() == hm.get(s.charAt(i))) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}
