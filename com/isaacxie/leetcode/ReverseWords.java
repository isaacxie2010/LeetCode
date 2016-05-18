package com.isaacxie.leetcode;

public class ReverseWords {
	// https://leetcode.com/problems/reverse-words-in-a-string/
	
	public String reverseWords(String s) {
		String[] arr = s.trim().split(" +");
		StringBuilder sb = new StringBuilder();
		for (int index = arr.length - 1; index >= 0; index--) {
			sb.append(arr[index]).append(" ");
		}
		return sb.toString().trim();
	}
}
