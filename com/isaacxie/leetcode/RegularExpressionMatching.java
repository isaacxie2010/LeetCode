package com.isaacxie.leetcode;

public class RegularExpressionMatching {
	// https://leetcode.com/problems/regular-expression-matching/

	public boolean isMatch(String s, String p) {
		for (int i = 0; i < p.length(); s = s.substring(1)) {
			char c = p.charAt(i);
			if (i >= p.length() - 1 || p.charAt(i + 1) != '*') {
				i++;
			} else if (isMatch(s, p.substring(i + 2))) {
				return true;
			}
			if (s.isEmpty() || (c != '.' && c != s.charAt(0))) {
				return false;
			}
		}
		return s.isEmpty();
	}

}
