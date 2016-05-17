package com.isaacxie.leetcode;

public class ValidPalindrome {
	// https://leetcode.com/problems/valid-palindrome/

	public boolean isPalindrome(String s) {
		s = s.trim();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (!isValid(s.charAt(i))) {
				i++;
				continue;
			}
			if (!isValid(s.charAt(j))) {
				j--;
				continue;
			}
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private boolean isValid(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}
}
