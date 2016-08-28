package com.isaacxie.leetcode;

public class ClimbingStairs {
	// http://oj.leetcode.com/problems/climbing-stairs/

	public int climbStairs(int n) {
		int ones = 1;
		int twos = 1;
		int temp = 0;
		for (int i = 2; i <= n; i++) {
			temp = ones + twos;
			ones = twos;
			twos = temp;
		}
		return twos;
	}

}
