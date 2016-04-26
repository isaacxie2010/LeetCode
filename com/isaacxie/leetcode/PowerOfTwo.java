package com.isaacxie.leetcode;

public class PowerOfTwo {
	//https://leetcode.com/problems/power-of-two/
	
	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0; 
	}
}
