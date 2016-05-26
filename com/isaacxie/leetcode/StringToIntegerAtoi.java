package com.isaacxie.leetcode;

public class StringToIntegerAtoi {

	public int myAtoi(String str) {
		if (str == null) {
			return 0;
		}
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}
		int flag = 1;
		int i = 0;
		if (str.charAt(i) == '+') {
			i++;
		} else if (str.charAt(i) == '-') {
			flag = -1;
			i++;
		}
		long result = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				result = result * 10 + (str.charAt(i) - '0');
				if (result * flag > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (result * flag < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			} else {
				break;
			}
		}
		return (int) result * flag;
	}
}
