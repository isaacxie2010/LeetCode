package com.isaacxie.leetcode;

public class _AddStrings {
	// https://leetcode.com/problems/add-strings

	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int len1 = num1.length();
		int len2 = num2.length();
		int i = 0;
		while (i < len1 || i < len2) {
			int sum = carry;
			if (i < len1 && i < len2) {
				sum += num1.charAt(len1 - 1 - i) - '0';
				sum += num2.charAt(len2 - 1 - i) - '0';
			} else if (i < len1) {
				sum += num1.charAt(len1 - 1 - i) - '0';
			} else if (i < len2) {
				sum += num2.charAt(len2 - 1 - i) - '0';
			}
			sb.append(sum % 10);
			carry = sum / 10;
			i++;
		}
		if (carry == 1) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
}