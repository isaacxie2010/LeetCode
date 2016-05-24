package com.isaacxie.leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int div = 1;
		while (x / 10 > div) {
			div *= 10;
		}
		while (x > 0) {
			int left = x / div;
			int right = x % 10;
			if (left != right) {
				return false;
			}
			x = (x - left * div - right) / 10;
			div /= 100;
		}
		return true;
	}
}
