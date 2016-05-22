package com.isaacxie.leetcode;

public class LongestPalindromicSubstring {
	// https://leetcode.com/problems/longest-palindromic-substring/

	public String longestPalindrome(String s) {
		if (s == null || s.isEmpty() || s.length() < 2) {
			return s;
		}
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			String even = expandFromCenter(s, i, i);
			if (longest.length() < even.length()) {
				longest = even;
			}
			String odd = expandFromCenter(s, i, i + 1);
			if (longest.length() < odd.length()) {
				longest = odd;
			}
		}
		return longest;
	}

	private String expandFromCenter(String s, int start, int end) {
		int l = start;
		int r = end;
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return s.substring(l + 1, r);
	}
}
