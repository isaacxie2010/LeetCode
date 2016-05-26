package com.isaacxie.leetcode;

public class LongestCommonPrefix {
	// https://leetcode.com/problems/longest-common-prefix/

	public String longestCommonPrefix(String[] strs) {
		if (strs.length < 1) {
			return "";
		}
		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);
			}
		}
		return pre;
	}
}
