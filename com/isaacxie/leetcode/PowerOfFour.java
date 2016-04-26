package com.isaacxie.leetcode;

public class PowerOfFour {
	// https://leetcode.com/problems/power-of-four/

	public boolean isPowerOfFour(int num) {
		return num == 1 || (((num & (num - 1)) == 0) && (num % 10 == 4 || num % 10 == 6));
	}
}
