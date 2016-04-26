package com.isaacxie.leetcode;

public class IntegerBreak {
	// https://leetcode.com/problems/integer-break/

	public int integerBreak(int n) {
		if(n == 2) {
			return 1;
		}
		if(n == 3) {
			return 2;
		}
		if(n == 4) {
			return 4;
		}
		int[] arr = new int[n - 1];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		for(int i = 3; i < n - 1; i++){
			arr[i] = arr[i - 3]*3;
		}
		return arr[n - 2];
	}
}
