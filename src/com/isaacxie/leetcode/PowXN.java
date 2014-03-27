package com.isaacxie.leetcode;

public class PowXN {
	// http://oj.leetcode.com/problems/powx-n/

	public double pow(double x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		double half = pow(x, n / 2);
		if (n % 2 == 0) {
			return half * half;
		}
		if (n > 0) {
			return half * half * x;
		} else {
			return half * half / x;
		}
	}

}
