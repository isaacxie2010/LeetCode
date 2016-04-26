package com.isaacxie.leetcode;

public class ReverseString {
	// https://leetcode.com/problems/reverse-string/

	public String reverseString(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		char[] array = s.toCharArray();
		int i = 0, j = array.length - 1;
		while (i < j) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(array);
	}

	public String reverseStringRecursive(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		return reverseStringRecursive(s.substring(s.length() / 2, s.length()))
				+ reverseStringRecursive(s.substring(0, s.length() / 2));
	}

	public String reverseStringIntuitive(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
