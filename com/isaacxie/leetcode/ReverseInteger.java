package com.isaacxie.leetcode;

public class ReverseInteger {
	// https://leetcode.com/problems/reverse-integer/

	public int reverse(int x) {
		long sum = 0;
		while (x != 0) {
			int num = x % 10;
			sum = sum * 10 + num;
			x = x / 10;
		}
		if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) sum;
		}
	}
}
