package com.isaacxie.leetcode;

public class IntegerToRoman {
	// https://leetcode.com/problems/integer-to-roman/
	
	public String intToRoman(int num) {
		String[] strs = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] arrs = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i< arrs.length; i++) {
			int times = num/arrs[i];
			num = num - times * arrs[i];
			for(; times > 0; times--) {
				sb.append(strs[i]);
			}
		}
		return sb.toString();
	}
}
