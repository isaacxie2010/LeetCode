package com.isaacxie.leetcode;

import java.util.ArrayList;

public class GenerateParentheses {
	// http://oj.leetcode.com/problems/generate-parentheses/

	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<String>();
		parenthesisHelper(n, n, "", list);
		return list;
	}

	private void parenthesisHelper(int left, int right, String str,
			ArrayList<String> list) {
		if (left == 0 && right == 0) {
			list.add(str);
		}
		if (left > 0) {
			parenthesisHelper(left - 1, right, str + "(", list);
		}
		if (left < right) {
			parenthesisHelper(left, right - 1, str + ")", list);
		}
	}
}
