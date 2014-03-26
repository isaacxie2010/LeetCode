package com.isaacxie.leetcode;

public class Atoi {
	// http://oj.leetcode.com/problems/string-to-integer-atoi/

	public int atoi(String str) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (str == null)
			return 0;
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}
		boolean flag = true;
		int index = 0;
		if (str.charAt(0) == '+') {
			index++;
		} else if (str.charAt(0) == '-') {
			flag = false;
			index++;
		}
		long result = 0;
		for (; index < str.length(); index++) {
			if (str.charAt(index) > '9' || str.charAt(index) < '0') {
				break;
			} else {
				result = result * 10 + str.charAt(index) - '0';
			}
		}
		if (!flag) {
			result = -result;
		}
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) result;
	}
}
