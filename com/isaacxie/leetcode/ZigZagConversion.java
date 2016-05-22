package com.isaacxie.leetcode;

public class ZigZagConversion {
	// https://leetcode.com/problems/zigzag-conversion/
	
	public String convert(String s, int numRows) {
		if (numRows < 2) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int block = 2 * numRows - 2;
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j += block) {
				sb.append(s.charAt(j));
				if (i > 0 && i < numRows - 1) {
					int mid = j + block - 2 * i;
					if (mid < s.length()) {
						sb.append(s.charAt(mid));
					}
				}
			}
		}
		return sb.toString();
	}

}
