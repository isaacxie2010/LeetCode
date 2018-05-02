package com.isaacxie.leetcode;

public class _2KeysKeyboard {
	// https://leetcode.com/problems/2-keys-keyboard/

	public int minSteps(int n) {
		if (n == 1) {  // base case, no operation needed
			return 0;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) { //p + q <= pq
			if (n % i == 0) {  
				return i + minSteps(n / i); // 1 step copy, i - 1 paste
			}
		}
		return n;
	}
}
